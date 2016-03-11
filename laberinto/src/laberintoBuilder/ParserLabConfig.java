package laberintoBuilder;
import static java.lang.Math.toIntExact;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import laberinto.*;
public class ParserLabConfig {

	private JSONParser parser=new JSONParser();
	private JSONObject dic;
	private LaberintoBuilderAC bldr;
	public JuegoLaberinto obtenerLaberinto(){
		return bldr.obtenerJuego();
	}
	
	public void leerArchivo(String nombre){
    try {     
        Object obj = parser.parse(new FileReader(nombre));
        dic=(JSONObject) obj;

	} catch (FileNotFoundException e) {
        e.printStackTrace();
	} catch (ParseException e) {
        e.printStackTrace();
    } catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void procesar(String nombre){
		leerArchivo(nombre);
		iniBuilder();
		crearLaberinto();
		crearJuego();
		crearBichos();
	}
	public void iniBuilder(){
		if (((String) dic.get("forma")).indexOf("rectangulo")!=-1){
			bldr=new LaberintoNormalBuilder();
		}
	}
	public void crearJuego(){
		bldr.construirJuego();
	}
	public void crearLaberinto(){
		bldr.iniOrientaciones();
		bldr.construirLaberinto();
		JSONArray lista = (JSONArray) dic.get("laberinto");

	    for (Object elemento : lista)
	    {
	      crearLaberintoRecursivo((JSONObject)elemento,null);
	    }
	}
	
	public void crearLaberintoRecursivo(JSONObject elemento, Contenedor padre){
		Contenedor con=null;
		if (((String) elemento.get("em")).indexOf("contenedor")!=-1){
			if (((String) elemento.get("tipo")).indexOf("habitacion")!=-1){
				con=bldr.construirHabitacion();
			}
			if (((String) elemento.get("tipo")).indexOf("armario")!=-1){
				con=bldr.construirArmario(padre);
			}
			JSONArray lista = (JSONArray) dic.get("hijos");
			if (lista!=null){
			    for (Object elemento2 : lista)
			    {
			      crearLaberintoRecursivo((JSONObject)elemento2,con);
			    }
			}
		}
		if (((String) elemento.get("em")).indexOf("hoja")!=-1){
			if (((String) elemento.get("tipo")).indexOf("bomba")!=-1){
				bldr.construirBomba(padre);
			}
		}
	}
	
	public void crearBichos(){
		JSONArray lista = (JSONArray) dic.get("bichos");
		if (lista!=null){
		    for (Object elemento : lista)
		    {
		    	JSONArray parametros=(JSONArray) elemento;
		    	long valor=(long) parametros.get(1);
		    	bldr.construirBicho((String) parametros.get(0), toIntExact(valor));
		    }
		}
	}
}

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
	public JuegoLaberinto obtenerJuego(){
		return bldr.obtenerJuego();
	}
	public Laberinto obtenerLaberinto(){
		return bldr.obtenerLaberinto();
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
		if (((String) dic.get("forma")).indexOf("hexagono")!=-1){
			bldr=new LaberintoHexagonalBuilder();
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
	    JSONArray puertas = (JSONArray) dic.get("puertas");
		if (puertas!=null){
		    for (Object elemento : puertas)
		    {
		    	JSONArray parametros=(JSONArray) elemento;
		    	long num1=(long) parametros.get(0);
		    	String or1=(String) parametros.get(1);
		    	long num2=(long) parametros.get(2);
		    	String or2=(String) parametros.get(3);
		    	bldr.fabricarPuerta(toIntExact(num1),or1,toIntExact(num2),or2);
		    }
		}   
	}
	
	public void crearLaberintoRecursivo(JSONObject elemento, Contenedor padre){
		Contenedor con=null;
		
		if (((String) elemento.get("tipo")).indexOf("habitacion")!=-1){
				con=bldr.construirHabitacion();
			}
		if (((String) elemento.get("tipo")).indexOf("armario")!=-1){
				con=bldr.construirArmario(padre);
			}
		
		if (((String) elemento.get("tipo")).indexOf("hole")!=-1){
			String nombre=(String) elemento.get("config");
			bldr.construirBlackHole(padre,nombre);
		}
		if (((String) elemento.get("tipo")).indexOf("bomba")!=-1){
			bldr.construirBomba(padre);
		}
		JSONArray lista = (JSONArray) elemento.get("hijos");
		if (lista!=null){
		    for (Object elemento2 : lista)
		    {
		      crearLaberintoRecursivo((JSONObject)elemento2,con);
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

package laberintoBuilder;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

import laberinto.*;

public class LaberintoNormalBuilder extends LaberintoBuilderAC {
	private Laberinto laberinto;
	private JuegoLaberinto juego;
	private Dictionary<String,Orientacion> orientaciones=new Hashtable<String,Orientacion>();

	public Laberinto getLaberinto() {
		return laberinto;
	}
	public void setLaberinto(Laberinto laberinto) {
		this.laberinto = laberinto;
	}
	public JuegoLaberinto getJuego() {
		return juego;
	}
	public void setJuego(JuegoLaberinto juego) {
		this.juego = juego;
	}
	public JuegoLaberinto obtenerJuego(){
		return juego;
	}
	public Pared construirPared(){return new Pared();}
	public Armario construirArmario(Contenedor con){
		Armario armario=new Armario();
		con.agregarHijo(armario);
		return armario;
	}
	public void construirBicho(String es, int num){
		Bicho bicho=new Bicho();
		Estrategia estrategia;
		if (es=="reloj"){
			estrategia=new EstrategiaSentidoReloj();
			bicho.setEstrategia(estrategia);
		}
		Habitacion hab=laberinto.obtenerHabitacion(num);
		bicho.colocarEn(hab);
	}
	public void construirBomba(Contenedor con){
		Bomba bomba=new Bomba();
		con.agregarHijo(bomba);
	}
	public Habitacion construirHabitacion(){
		int num=laberinto.getHabitaciones().size();
		Habitacion hab=new Habitacion(num);
		hab.ponerElementoEn(construirPared(), OrientacionNorte.norte());
		hab.ponerElementoEn(construirPared(), OrientacionEste.este());
		hab.ponerElementoEn(construirPared(), OrientacionSur.sur());
		hab.ponerElementoEn(construirPared(), OrientacionOeste.oeste());
		
		laberinto.agregarHabitacion(hab);
		return hab;
	}
	public void iniOrientaciones(){
		orientaciones.put("norte",OrientacionNorte.norte());
		orientaciones.put("este",OrientacionEste.este());
		orientaciones.put("sur",OrientacionSur.sur());
		orientaciones.put("oeste",OrientacionOeste.oeste());
	}
	public void construirJuego(){
		juego=new JuegoLaberinto();
		juego.asignarLaberinto(laberinto);
	}
	public void construirLaberinto(){
		setLaberinto(new Laberinto());
	}
	public void fabricarPuerta(int num1,String or1,int num2,String or2){
		Habitacion hab1=laberinto.obtenerHabitacion(num1);
		Habitacion hab2=laberinto.obtenerHabitacion(num2);
		Puerta puerta=new Puerta(hab1,hab2);
		hab1.ponerElementoEn(puerta, (Orientacion) orientaciones.get(or1));
		hab2.ponerElementoEn(puerta, (Orientacion) orientaciones.get(or2));
	}
}
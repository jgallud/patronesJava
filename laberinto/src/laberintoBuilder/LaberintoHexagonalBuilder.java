package laberintoBuilder;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

import laberinto.Habitacion;
import laberinto.Hexagonal;
import laberinto.Orientacion;
import laberinto.OrientacionEste;
import laberinto.OrientacionNorEste;
import laberinto.OrientacionNorOeste;
import laberinto.OrientacionNorte;
import laberinto.OrientacionOeste;
import laberinto.OrientacionSur;
import laberinto.OrientacionSurEste;
import laberinto.OrientacionSurOeste;
import laberinto.Rectangular;

public class LaberintoHexagonalBuilder extends LaberintoNormalBuilder {
	public Habitacion construirHabitacion(){
		int num=laberinto.getHabitaciones().size();
		Habitacion hab=new Habitacion(num);
		hab.setForma(new Hexagonal());
		hab.ponerElementoEn(construirPared(), OrientacionNorte.norte());
		hab.ponerElementoEn(construirPared(), OrientacionNorEste.noreste());
		hab.ponerElementoEn(construirPared(), OrientacionNorOeste.noroeste());
		hab.ponerElementoEn(construirPared(), OrientacionSur.sur());
		hab.ponerElementoEn(construirPared(), OrientacionSurEste.sureste());
		hab.ponerElementoEn(construirPared(), OrientacionSurOeste.suroeste());
		
		List<Orientacion> lista=hab.getOrientaciones();
		
		for(Orientacion entrada: orientaciones.values()){
			lista.add(entrada);
		}
		hab.setOrientaciones(lista);
		
		laberinto.agregarHabitacion(hab);
		return hab;
	}
	public void iniOrientaciones(){
		orientaciones.put("OrNorte",OrientacionNorte.norte());
		orientaciones.put("OrNorEste",OrientacionNorEste.noreste());
		orientaciones.put("OrSurEste",OrientacionSurEste.sureste());
		orientaciones.put("OrSur",OrientacionSur.sur());
		orientaciones.put("OrSurOeste",OrientacionSurOeste.suroeste());
		orientaciones.put("OrNorOeste",OrientacionNorOeste.noroeste());
	}
}

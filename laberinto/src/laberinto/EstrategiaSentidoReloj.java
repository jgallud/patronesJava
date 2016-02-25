package laberinto;

import java.util.List;

public class EstrategiaSentidoReloj extends Estrategia {
	private EnteAutonomo bicho;
	private int actual;
	EstrategiaSentidoReloj(){
		this.actual=0;
	}
	Orientacion siguiente(){
		List<Orientacion> orientaciones=bicho.posicion.getOrientaciones();
		this.actual=(this.actual+1)%orientaciones.size();
		return orientaciones.get(this.actual);
	}
	void accion(EnteAutonomo bicho){
		this.bicho=bicho;
		Orientacion or=siguiente();
		or.entrar(bicho);
	}
}

package laberinto;

import java.util.List;

public class EstrategiaSentidoReloj extends Estrategia {
	private Bicho bicho;
	private int actual;
	Orientacion siguiente(){
		List<Orientacion> orientaciones=bicho.posicion.getOrientaciones();
		actual=(actual+1)%orientaciones.size();
		return orientaciones.get(actual);
	}
	void accion(Bicho bicho){
		this.bicho=bicho;
		Orientacion or=siguiente();
		or.entrar(bicho);
	}
}

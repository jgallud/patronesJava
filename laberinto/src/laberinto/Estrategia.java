package laberinto;

import java.util.List;

public abstract class Estrategia {
	private int actual;
	protected Bicho bicho;
	protected List<Orientacion> orientaciones;
	void dormir(){};
	void atacar(){};
	void caminar(){};
	public Bicho getBicho(){return bicho;}
	public void setBicho(Bicho bicho){
		this.bicho=bicho;
		orientaciones=bicho.posicion.getOrientaciones();
	}
	void accion(){
		this.caminar();
		this.dormir();
	}
}

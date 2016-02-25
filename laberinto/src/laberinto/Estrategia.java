package laberinto;

public abstract class Estrategia {
	private int actual;
	protected Bicho bicho;
	void dormir(){};
	void atacar(){};
	void caminar(){};
	void accion(Bicho bicho){
		this.bicho=bicho;
		this.caminar();
		this.dormir();
	}
}

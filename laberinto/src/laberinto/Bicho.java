package laberinto;

public class Bicho extends EnteAutonomo implements Runnable {
	private Estrategia estrategia;
	void accion(){
		this.estrategia.accion(this);
	}
	public void run(){
		this.accion();
		this.accion();
		this.accion();
		this.accion();
	}
	
	public Estrategia getEstrategia() {
		return estrategia;
	}
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
}

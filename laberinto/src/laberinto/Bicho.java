package laberinto;

public class Bicho extends EnteAutonomo implements Runnable {
	private Estrategia estrategia;
	void accion(){
		this.estrategia.accion();
	}
	public void run(){
		this.estrategia.setBicho(this);
		while(true){
			this.accion();		
		}
	}
	
	public Estrategia getEstrategia() {
		return estrategia;
	}
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
}

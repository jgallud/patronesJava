package laberinto;

public class Bicho extends EnteAutonomo {
	private Estrategia estrategia;
	void accion(){
		this.estrategia.accion(this);
	}
	public Estrategia getEstrategia() {
		return estrategia;
	}
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
}

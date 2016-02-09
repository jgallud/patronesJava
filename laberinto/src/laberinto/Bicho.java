package laberinto;

public class Bicho {
	private Estrategia estrategia;
	Habitacion posicion;
	void accion(){
		this.estrategia.accion(this);
	}
	public Estrategia getEstrategia() {
		return estrategia;
	}
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	public void colocarEn(Habitacion hab){
		posicion=hab;
	}
	
}

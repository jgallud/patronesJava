package laberinto;

public abstract class EnteAutonomo {

	protected Habitacion posicion;
	Habitacion getPosicion(){
		return posicion;
	}

	public void colocarEn(Habitacion hab) {
		posicion=hab;
	}

	public void irAlSurEste() {
		posicion.irAlSurEste(this);
	}
	
	public void irAlSurOeste() {
		posicion.irAlSurOeste(this);
	}

	public void irAlEste() {
		posicion.irAlEste(this);
		
	}

	public void irAlNorte() {
		posicion.irAlNorte(this);
	}

	public void irAlOeste() {
		posicion.irAlOeste(this);
	}

	public void irAlSur() {
		posicion.irAlSur(this);
	}

	public void irAlNorEste() {
		posicion.irAlNorEste(this);
	}

	public void irAlNorOeste() {
		posicion.irAlNorOeste(this);
	}

}

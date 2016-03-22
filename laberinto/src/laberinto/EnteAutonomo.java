package laberinto;

public abstract class EnteAutonomo {

	protected Habitacion posicion;
	Habitacion getPosicion(){
		return posicion;
	}

	public void colocarEn(Habitacion hab) {
		posicion=hab;
	}

}

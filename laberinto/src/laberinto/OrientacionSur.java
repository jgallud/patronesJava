package laberinto;

public class OrientacionSur extends Orientacion {
	private static OrientacionSur miSur;	
	public static OrientacionSur sur(){
		if (miSur==null){
			miSur=new OrientacionSur();
		}
		return miSur;
	}
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setSur(elto);
	}
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//ElementoMapa elto=hab.getSur();
		//elto.entrar();
		ea.irAlSur();
	}
	public void ponerElementoEnRectangulo(Rectangular forma, ElementoMapa em) {
		forma.setSur(em);
	}
	public void ponerElementoEnHexagono(Hexagonal forma, ElementoMapa em) {
		forma.setSur(em);
	}
}

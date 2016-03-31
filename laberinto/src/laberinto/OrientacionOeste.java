package laberinto;

public class OrientacionOeste extends Orientacion {
	private static OrientacionOeste miOeste;	
	public static OrientacionOeste oeste(){
		if (miOeste==null){
			miOeste=new OrientacionOeste();
		}
		return miOeste;
	}
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setOeste(elto);
	}
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//ElementoMapa elto=hab.getOeste();
		//elto.entrar();
		ea.irAlOeste();
	}
	public void ponerElementoEnRectangulo(Rectangular forma, ElementoMapa em) {
		forma.setOeste(em);
	}
}

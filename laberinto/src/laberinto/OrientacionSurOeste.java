package laberinto;

public class OrientacionSurOeste extends Orientacion {
	private static OrientacionSurOeste miSurOeste;	
	public static OrientacionSurOeste suroeste(){
		if (miSurOeste==null){
			miSurOeste=new OrientacionSurOeste();
		}
		return miSurOeste;
	}
	
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//Forma forma= hab.getForma();
		//ElementoMapa elto=forma.getNoreste();
		//elto.entrar();
		ea.irAlSurOeste();
	}

	public void ponerElementoEnHexagono(Hexagonal forma, ElementoMapa em) {
		forma.setSuroeste(em);
	}
}

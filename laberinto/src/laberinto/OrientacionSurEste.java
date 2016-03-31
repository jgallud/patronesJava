package laberinto;

public class OrientacionSurEste extends Orientacion {
	private static OrientacionSurEste miSurEste;	
	public static OrientacionSurEste sureste(){
		if (miSurEste==null){
			miSurEste=new OrientacionSurEste();
		}
		return miSurEste;
	}
	
	public void entrar(EnteAutonomo bicho){
		//Habitacion hab=bicho.posicion;
		//Forma forma= hab.getForma();
		//ElementoMapa elto=forma.getNoreste();
		//elto.entrar();
		bicho.irAlSurEste();
	}

	public void ponerElementoEnHexagono(Hexagonal forma, ElementoMapa em) {
		forma.setSureste(em);
	}
}

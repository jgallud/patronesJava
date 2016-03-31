package laberinto;

public class OrientacionNorOeste extends Orientacion {
	private static OrientacionNorOeste miNorOeste;	
	public static OrientacionNorOeste noroeste(){
		if (miNorOeste==null){
			miNorOeste=new OrientacionNorOeste();
		}
		return miNorOeste;
	}
	
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//Forma forma= hab.getForma();
		//ElementoMapa elto=forma.getNoreste();
		//elto.entrar();
		ea.irAlNorOeste();
	}

	public void ponerElementoEnHexagono(Hexagonal forma, ElementoMapa em) {
		forma.setNoroeste(em);
	}
}

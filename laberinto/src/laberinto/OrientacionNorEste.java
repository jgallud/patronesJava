package laberinto;

public class OrientacionNorEste extends Orientacion {
	private static OrientacionNorEste miNorEste;	
	public static OrientacionNorEste noreste(){
		if (miNorEste==null){
			miNorEste=new OrientacionNorEste();
		}
		return miNorEste;
	}
	
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//Forma forma= hab.getForma();
		//ElementoMapa elto=forma.getNoreste();
		//elto.entrar();
		ea.irAlNorEste();
	}

	public void ponerElementoEnHexagono(Hexagonal forma, ElementoMapa em) {
		forma.setNoreste(em);
	}
}

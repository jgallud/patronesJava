package laberinto;

public class OrientacionNorte extends Orientacion {
	private static OrientacionNorte miNorte;	
	public static OrientacionNorte norte(){
		if (miNorte==null){
			miNorte=new OrientacionNorte();
		}
		return miNorte;
	}
	
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setNorte(elto);
	}
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//ElementoMapa elto=hab.getNorte();
		//elto.entrar();
		ea.irAlNorte();
	}
	public void ponerElementoEnRectangulo(Rectangular forma, ElementoMapa em) {
		forma.setNorte(em);
	}
	public void ponerElementoEnHexagono(Hexagonal forma, ElementoMapa em) {
		forma.setNorte(em);
	}
}

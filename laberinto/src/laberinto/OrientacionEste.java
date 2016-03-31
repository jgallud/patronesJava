package laberinto;

public class OrientacionEste extends Orientacion {
	private static OrientacionEste miEste;	
	public static OrientacionEste este(){
		if (miEste==null){
			miEste=new OrientacionEste();
		}
		return miEste;
	}
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setEste(elto);
	}
	public void entrar(EnteAutonomo ea){
		//Habitacion hab=bicho.posicion;
		//ElementoMapa elto=hab.getEste();
		//elto.entrar();
		ea.irAlEste();
	}
	
	public void ponerElementoEnRectangulo(Rectangular forma, ElementoMapa em) {
		forma.setEste(em);
	}
	
}

package laberinto;

public class OrientacionNorte extends Orientacion {
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setNorte(elto);
	}
	public void entrar(Bicho bicho){
		Habitacion hab=bicho.posicion;
		ElementoMapa elto=hab.getNorte();
		elto.entrar();
	}

}

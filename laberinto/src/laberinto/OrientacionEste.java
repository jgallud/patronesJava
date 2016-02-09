package laberinto;

public class OrientacionEste extends Orientacion {
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setEste(elto);
	}
	public void entrar(Bicho bicho){
		Habitacion hab=bicho.posicion;
		ElementoMapa elto=hab.getEste();
		elto.entrar();
	}
}

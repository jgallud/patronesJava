package laberinto;

public class OrientacionOeste extends Orientacion {
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setOeste(elto);
	}
	public void entrar(Bicho bicho){
		Habitacion hab=bicho.posicion;
		ElementoMapa elto=hab.getOeste();
		elto.entrar();
	}
}

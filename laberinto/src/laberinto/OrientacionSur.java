package laberinto;

public class OrientacionSur extends Orientacion {
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setSur(elto);
	}
	public void entrar(Bicho bicho){
		Habitacion hab=bicho.posicion;
		ElementoMapa elto=hab.getSur();
		elto.entrar();
	}
}
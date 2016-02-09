package laberinto;

public class OrientacionEste extends Orientacion {
	void ponerElementoEn(Habitacion hab,ElementoMapa elto){
		hab.setEste(elto);
	}
}

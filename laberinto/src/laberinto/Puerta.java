package laberinto;

public class Puerta extends ElementoMapa {
	Habitacion hab1,hab2;
	Boolean abierta;
	
	Puerta(Habitacion h1, Habitacion h2){
		abierta=false;
		hab1=h1;
		hab2=h2;
	}

}

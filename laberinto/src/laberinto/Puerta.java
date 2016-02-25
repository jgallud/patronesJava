package laberinto;

public class Puerta extends Hoja {
	Habitacion hab1,hab2;
	Boolean abierta;
	
	Puerta(Habitacion h1, Habitacion h2){
		abierta=false;
		hab1=h1;
		hab2=h2;
	}
	
	public void entrar(){
		if(abierta)
			System.out.println("La puerta esta abierta");
		else
			System.out.println("La puerta esta cerrada");
	}
	public void entrar(EnteAutonomo ea){
		if(abierta)
			System.out.println("La puerta esta abierta");
		else
			System.out.println("La puerta esta cerrada");
	}
}

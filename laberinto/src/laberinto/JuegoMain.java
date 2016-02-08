package laberinto;

public class JuegoMain {

	public static void main(String[] args) {
		Laberinto lab;
		FactoryMethod fm = new FactoryMethod();
		JuegoLaberinto juego = new JuegoLaberinto();
		
		
		//lab=fm.crearLaberintoWired();
		//lab=fm.crearLaberinto();
		
		juego=new JuegoLaberintoBomba();
		
		//lab=fm.crearLaberinto();
		
		lab=fm.crearLaberintoOrientaciones();
		
		juego.asignarLaberinto(lab);
		
		System.out.println("Numero de habitaciones: "+lab.habitaciones.size());
	}

}

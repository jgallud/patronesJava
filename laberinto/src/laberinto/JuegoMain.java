package laberinto;

public class JuegoMain {

	public static void main(String[] args) {
		Laberinto lab;
		JuegoLaberinto juego = new JuegoLaberinto();
		
		//lab=juego.crearLaberintoWired();
		//lab=juego.crearLaberinto();
		
		juego=new JuegoLaberintoBomba();
		lab=juego.crearLaberinto();
		
		System.out.println("Numero de habitaciones: "+lab.habitaciones.size());
	}

}

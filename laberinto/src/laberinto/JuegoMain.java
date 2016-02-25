package laberinto;

public class JuegoMain {

	public static void main(String[] args) {
		Laberinto lab;
		Bicho bicho;
		Habitacion hab;
		
		FactoryMethod fm = new FactoryMethod();
		JuegoLaberinto juego = new JuegoLaberinto();
		
		
		//lab=fm.crearLaberintoWired();
		//lab=fm.crearLaberinto();
		
		juego=new JuegoLaberintoBomba();
		
		//lab=fm.crearLaberinto();
		
		//lab=fm.crearLaberintoOrientaciones();
		
		lab=fm.crearLaberintoComposite();
		juego.asignarLaberinto(lab);
		
		System.out.println("Numero de habitaciones: "+lab.habitaciones.size());
		
		hab=lab.obtenerHabitacion(1);
		
		bicho=new Bicho();
		bicho.colocarEn(hab);
		
		bicho.setEstrategia(new EstrategiaSentidoReloj());
		
		bicho.accion();
		bicho.accion();
		bicho.accion();
		bicho.accion();
		
		
	}

}

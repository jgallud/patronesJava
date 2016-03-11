package laberinto;

import factoryMethod.FactoryMethod;
import laberintoBuilder.*;

public class JuegoMain {

	public static void main(String[] args) {
		Laberinto lab;
		Bicho bicho;
		Habitacion hab;
		JuegoLaberinto juego;
		
		//FactoryMethod fm = new FactoryMethod();
		//JuegoLaberinto juego = new JuegoLaberinto();
		//lab=fm.crearLaberintoWired();
		//lab=fm.crearLaberinto();
		//juego=new JuegoLaberintoBomba();
		//lab=fm.crearLaberinto();
		//lab=fm.crearLaberintoOrientaciones();
		
		//lab=fm.crearLaberintoComposite();
		//juego.asignarLaberinto(lab);
		
		ParserLabConfig director = new ParserLabConfig();
		director.procesar("/Users/jgallud/CloudStation/dev/builder/rectangulo4hab1arm3bomRec.json");
		juego=director.obtenerLaberinto();
		lab=juego.getLaberinto();
		System.out.println("Numero de habitaciones: "+lab.getHabitaciones().size());
		
		hab=juego.getLaberinto().obtenerHabitacion(3);
		
		//bicho=new Bicho();
		//bicho.colocarEn(hab);
		
		//bicho.setEstrategia(new EstrategiaSentidoReloj());
		
		//(new Thread(bicho)).start();
		//bicho.accion();
		//bicho.accion();
		//bicho.accion();
		//bicho.accion();
		
		
	}

}

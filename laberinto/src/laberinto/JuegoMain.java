package laberinto;

import factoryMethod.FactoryMethod;
import laberintoBuilder.*;

public class JuegoMain {

	public static void main(String[] args) {
		Laberinto lab;
		Bicho bicho;
		Habitacion hab;
		JuegoLaberinto juego;
		Personaje per;
		
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
		//"/Volumes/Macintosh HD/dev/laberinto2016/builder/"
		String ruta="/soft/smalltalk/laberinto16/builder/";
		String nom="hexagono2habProxy1Bicho.json";
		nom="rectangulo2habProxyRec2.json";
		director.procesar(ruta+nom);
		juego=director.obtenerJuego();
		lab=director.obtenerLaberinto();
		System.out.println("Numero de habitaciones: "+lab.getHabitaciones().size());
		lab.listarElementos();
		
		//hab=lab.obtenerHabitacion(1);
		//per=new Personaje();
		////per.colocarEn(hab);
		//hab.entrar(per);
		
		//ElementoMapa em= hab.getHijos().get(0);
		//em.entrar(per);
		//lab.listarElementos();
		
		juego.lanzarBichos();
		
	}

}

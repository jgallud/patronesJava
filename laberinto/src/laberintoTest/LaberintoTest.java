package laberintoTest;

import laberinto.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LaberintoTest {
		private JuegoLaberinto juego;
		private Laberinto lab;
		@Before
		public void setUp(){
			FactoryMethod fm = new FactoryMethod();
			juego = new JuegoLaberinto();
			lab = fm.crearLaberintoOrientaciones();
			juego.asignarLaberinto(lab);
		}
		@Test
		public void testCrearJuego(){		
			assertNotNull(juego.getLaberinto());
		}
		@Test
		public void test2Habitaciones(){
			lab=juego.getLaberinto();
			assertEquals(lab.getHabitaciones().size(),2);
		}
}

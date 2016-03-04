package laberintoTest;
import laberinto.*;
import factoryMethod.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LaberintoTestComposite {
	private JuegoLaberinto juego;
	private Laberinto lab;
	
	@Before
	public void setUp(){
		FactoryMethod fm = new FactoryMethod();
		juego = new JuegoLaberinto();
		lab = fm.crearLaberintoComposite();
		juego.asignarLaberinto(lab);
	}
	@Test
	public void testCrearJuego(){		
		assertNotNull(juego.getLaberinto());
	}
	@Test
	public void test2Habitaciones(){
		lab=juego.getLaberinto();
		assertEquals(lab.getHabitaciones().size(),4);
	 }
	@Test
	public void testArmario(){
		lab=juego.getLaberinto();
		Habitacion hab=lab.obtenerHabitacion(2);
		assertEquals(hab.getHijos().size(),1);
		ElementoMapa elto=hab.getHijos().get(0);
		
		assertEquals(elto.getClass(),Armario.class);
	 }
			
}


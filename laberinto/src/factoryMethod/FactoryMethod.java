package factoryMethod;

import laberinto.*;

public class FactoryMethod {
	Laberinto crearLaberintoWired(){
		Laberinto lab = new Laberinto();
		Habitacion h1=new Habitacion(1);
		Habitacion h2=new Habitacion(2);
		
		Puerta puerta=new Puerta(h1,h2);
		
		h1.agregarLado(0,puerta);
		h2.agregarLado(2,puerta);
		
		lab.agregarHabitacion(h1);
		lab.agregarHabitacion(h2);
		return lab;
	}
	
	Laberinto crearLaberinto(){
		Laberinto lab = fabricarLaberinto();
		Habitacion h1= fabricarHabitacion(1);
		Habitacion h2= fabricarHabitacion(2);
		
		Puerta puerta=fabricarPuerta(h1,h2);
		
		h1.agregarLado(0,puerta);
		h1.agregarLado(1, fabricarPared());
		h1.agregarLado(2, fabricarPared());
		h1.agregarLado(3,fabricarPared());
		
		h2.agregarLado(2,puerta);
		h2.agregarLado(1, fabricarPared());
		h2.agregarLado(0, fabricarPared());
		h2.agregarLado(3,fabricarPared());
		
		lab.agregarHabitacion(h1);
		lab.agregarHabitacion(h2);
		return lab;
	}
	
	public Laberinto crearLaberintoComposite(){
		Laberinto lab = fabricarLaberinto();
		Habitacion h1= fabricarHabitacion(1);
		Habitacion h2= fabricarHabitacion(2);
		Habitacion h3=fabricarHabitacion(3);
		Habitacion h4=fabricarHabitacion(4);
		Armario armario=new Armario();
		
		Puerta puerta12=fabricarPuerta(h1,h2);
		Puerta puerta34=fabricarPuerta(h3,h4);
		Puerta puerta13=fabricarPuerta(h1,h3);
		Puerta puerta24=fabricarPuerta(h2,h4);
		
		h1.ponerElementoEn(puerta12, OrientacionNorte.norte());
		h1.ponerElementoEn(puerta13, new OrientacionEste());
		h1.ponerElementoEn(fabricarPared(), new OrientacionSur());
		h1.ponerElementoEn(fabricarPared(), new OrientacionOeste());		
		
		h2.ponerElementoEn(puerta12, new OrientacionSur());
		h2.ponerElementoEn(fabricarPared(), OrientacionNorte.norte());
		h2.ponerElementoEn(puerta24, new OrientacionEste());
		h2.ponerElementoEn(fabricarPared(), new OrientacionOeste());
		
		h3.ponerElementoEn(puerta34, OrientacionNorte.norte());
		h3.ponerElementoEn(puerta13, new OrientacionOeste());
		h3.ponerElementoEn(fabricarPared(), new OrientacionSur());
		h3.ponerElementoEn(fabricarPared(), new OrientacionEste());		
		
		h4.ponerElementoEn(puerta34, new OrientacionSur());
		h4.ponerElementoEn(fabricarPared(), OrientacionNorte.norte());
		h4.ponerElementoEn(puerta24, new OrientacionOeste());
		h4.ponerElementoEn(fabricarPared(), new OrientacionEste());
		
		armario.agregarHijo(new Bomba());
		h2.agregarHijo(armario);
		h1.agregarHijo(new Bomba());
		h4.agregarHijo(new Bomba());
		
		lab.agregarHabitacion(h1);
		lab.agregarHabitacion(h2);
		lab.agregarHabitacion(h3);
		lab.agregarHabitacion(h4);
		return lab;
	}
	
	public Laberinto crearLaberintoOrientaciones(){
		Laberinto lab = fabricarLaberinto();
		Habitacion h1= fabricarHabitacion(1);
		Habitacion h2= fabricarHabitacion(2);
		
		Puerta puerta=fabricarPuerta(h1,h2);
		
		h1.ponerElementoEn(puerta, new OrientacionNorte());
		h1.ponerElementoEn(fabricarPared(), new OrientacionEste());
		h1.ponerElementoEn(fabricarPared(), new OrientacionSur());
		h1.ponerElementoEn(fabricarPared(), new OrientacionOeste());		
		//h1.agregarLado(0,puerta);
		//h1.agregarLado(1, fabricarPared());
		//h1.agregarLado(2, fabricarPared());
		//h1.agregarLado(3,fabricarPared());
		
		h2.ponerElementoEn(puerta, new OrientacionSur());
		h2.ponerElementoEn(fabricarPared(), new OrientacionNorte());
		h2.ponerElementoEn(fabricarPared(), new OrientacionNorte());
		h2.ponerElementoEn(fabricarPared(), new OrientacionNorte());
		//h2.agregarLado(2,puerta);
		//h2.agregarLado(1, fabricarPared());
		//h2.ponerElementoEn(fabricarPared(), new OrientacionNorte());
		//h2.agregarLado(0, fabricarPared());
		//h2.agregarLado(3,fabricarPared());
		
		lab.agregarHabitacion(h1);
		lab.agregarHabitacion(h2);
		return lab;
	}
	
	Laberinto fabricarLaberinto(){
		return new Laberinto();
	}
	Pared fabricarPared(){
		return new Pared();
	}
	Puerta fabricarPuerta(Habitacion h1,Habitacion h2){
		return new Puerta(h1,h2);
	}
	Habitacion fabricarHabitacion(int num){
		return new Habitacion(num);
	}
}

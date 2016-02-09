package laberinto;

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
	
	Laberinto crearLaberintoOrientaciones(){
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

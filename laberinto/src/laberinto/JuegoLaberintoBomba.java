package laberinto;

public class JuegoLaberintoBomba extends JuegoLaberinto {
	Pared fabricarPared(){
		return new ParedBomba();
	}
	Habitacion fabricarHabitacion(int num){
		return new HabitacionConBomba(num);
	}
}

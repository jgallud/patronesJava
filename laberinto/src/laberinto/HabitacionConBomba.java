package laberinto;

public class HabitacionConBomba extends Habitacion {
	public HabitacionConBomba(int num) {
		super(num);
		lados.clear();
		for(int i=0;i<4;i++)
			lados.add(new ParedBomba());
	}
}

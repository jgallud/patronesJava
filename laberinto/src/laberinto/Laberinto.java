package laberinto;

import java.util.ArrayList;
import java.util.List;

public class Laberinto {
	List<Habitacion> habitaciones=new ArrayList<>();
	
	void agregarHabitacion(Habitacion hab){
		habitaciones.add(hab);
	}
	
	public Habitacion obtenerHabitacion(int num){
		Habitacion hab;
		for(int i=0;i<this.habitaciones.size();i++){
			hab=habitaciones.get(i);
			if (hab.getNumeroHabitacion()==num){
				return hab;
			}
		}
		return null;
	}
	
}

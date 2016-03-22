package laberinto;

import java.util.ArrayList;
import java.util.List;

public class Laberinto extends LaberintoAC {
	List<Habitacion> habitaciones=new ArrayList<>();
	
	public void agregarHabitacion(Habitacion hab){
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
	public List<Habitacion> getHabitaciones(){
		return this.habitaciones;
	}
	
	public void listarElementos(){
		System.out.println("Elementos del laberinto");
		for(int i=0;i<habitaciones.size();i++){
			habitaciones.get(i).listarElementos();
		}
	}
}

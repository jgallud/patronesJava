package laberinto;

import java.util.ArrayList;
import java.util.List;

public class Habitacion extends ElementoMapa {
	int numeroHabitacion;
	List<ElementoMapa> lados=new ArrayList<>();
	
	public Habitacion(int num){
		numeroHabitacion=num;
		for(int i=0;i<4;i++)
			lados.add(new Pared());
	}
	
	void agregarLado(int num,ElementoMapa em){
		lados.remove(num);
		lados.add(num,em);
	}

}

package laberinto;

import java.util.ArrayList;
import java.util.List;

public class Habitacion extends ElementoMapa {
	int numeroHabitacion;
	private ElementoMapa norte,sur,este,oeste;
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
	void norte(ElementoMapa elto){
		this.norte=elto;
	}
	void sur(ElementoMapa elto){
		this.sur=elto;
	}
	
	void ponerElementoEn(ElementoMapa elto,Orientacion or){
		or.ponerElementoEn(this, elto);
	}

}

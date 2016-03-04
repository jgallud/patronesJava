package laberinto;

import java.util.*;

public class Contenedor extends ElementoMapa {
	private List<ElementoMapa> hijos= new ArrayList<>();
	public void agregarHijo(ElementoMapa em){
		hijos.add(em);
	}
	public List<ElementoMapa> getHijos(){
		return hijos;
	}
}

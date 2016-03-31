package laberinto;

import java.util.ArrayList;
import java.util.List;

public class JuegoLaberinto {

	Laberinto lab;
	private List<Bicho> bichos=new ArrayList<>();
	private List<Thread> procesos=new ArrayList<>();
	
	public void asignarLaberinto(Laberinto lab){
		this.lab=lab;
	}
	public Laberinto getLaberinto(){
		return this.lab;
	}
	public void agregarBicho(Bicho bicho){
		bichos.add(bicho);
	}
	public List<Bicho> obtenerBichos(){return bichos;}
	
	public void lanzarBichos(){
		for(int i=0;i<this.bichos.size();i++){
			procesos.add(new Thread(bichos.get(i)));
		}
		for(int i=0;i<this.procesos.size();i++){
			procesos.get(i).start();
		}
	}
}

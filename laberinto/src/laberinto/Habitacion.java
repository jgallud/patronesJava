package laberinto;

import java.util.ArrayList;
import java.util.List;

public class Habitacion extends Contenedor {
	private int numeroHabitacion;
	private ElementoMapa norte,sur,este,oeste;
	private Forma forma;
	List<Orientacion> orientaciones=new ArrayList<>();
	List<ElementoMapa> lados=new ArrayList<>();
	
	void iniOrientaciones(){
		orientaciones.add(new OrientacionNorte());
		orientaciones.add(new OrientacionEste());
		orientaciones.add(new OrientacionSur());
		orientaciones.add(new OrientacionOeste());
	}
	public Habitacion(int num){
		this.numeroHabitacion=num;
		for(int i=0;i<4;i++)
			lados.add(new Pared());
		iniOrientaciones();
	}
	
	public int getNumeroHabitacion(){
		return this.numeroHabitacion;
	}
	
	public List<Orientacion> getOrientaciones(){
		return orientaciones;
	}
	
	public void agregarLado(int num,ElementoMapa em){
		lados.remove(num);
		lados.add(num,em);
	}
	
	public void ponerElementoEn(ElementoMapa elto,Orientacion or){
		//or.ponerElementoEn(this, elto);
		forma.ponerEn(elto, or);
	}
	public ElementoMapa getNorte() {
		return norte;
	}
	public void setNorte(ElementoMapa norte) {
		this.norte = norte;
	}
	public ElementoMapa getSur() {
		return sur;
	}
	public void setSur(ElementoMapa sur) {
		this.sur = sur;
	}
	public ElementoMapa getEste() {
		return este;
	}
	public void setEste(ElementoMapa este) {
		this.este = este;
	}
	public ElementoMapa getOeste() {
		return oeste;
	}
	public void setOeste(ElementoMapa oeste) {
		this.oeste = oeste;
	}
	public void entrar(){
		System.out.println("Estas en la habitacion "+this.numeroHabitacion);
	}
	
	public void entrar(EnteAutonomo ea){
		System.out.println("Ente "+" esta en la habitacion "+this.numeroHabitacion);
	}
		
	public void listarElementos() {
		System.out.println("Elemento Habitacion: ");
		for(int i=0;i<hijos.size();i++){
			hijos.get(i).listarElementos();
		}
	}
	public Forma getForma() {
		return forma;
	}
	public void setForma(Forma forma) {
		this.forma = forma;
	}

}

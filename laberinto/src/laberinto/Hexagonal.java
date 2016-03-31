package laberinto;

public class Hexagonal extends Forma {
	private ElementoMapa norte;
	private ElementoMapa sur;
	private ElementoMapa noreste;
	private ElementoMapa noroeste;
	private ElementoMapa sureste;
	private ElementoMapa suroeste;
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
	public ElementoMapa getNoreste() {
		return noreste;
	}
	public void setNoreste(ElementoMapa noreste) {
		this.noreste = noreste;
	}
	public ElementoMapa getNoroeste() {
		return noroeste;
	}
	public void setNoroeste(ElementoMapa noroeste) {
		this.noroeste = noroeste;
	}
	public ElementoMapa getSureste() {
		return sureste;
	}
	public void setSureste(ElementoMapa sureste) {
		this.sureste = sureste;
	}
	public ElementoMapa getSuroeste() {
		return suroeste;
	}
	public void setSuroeste(ElementoMapa suroeste) {
		this.suroeste = suroeste;
	}
	public void ponerEn(ElementoMapa em,Orientacion or){
		or.ponerElementoEnHexagono(this, em);
	}
	public void irAlSur(EnteAutonomo ea) {this.getSur().entrar(ea);}
	public void irAlSurEste(EnteAutonomo ea){this.getSureste().entrar(ea);}
	public void irAlSurOeste(EnteAutonomo ea){this.getSuroeste().entrar(ea);}
	
	public void irAlNorte(EnteAutonomo ea) {this.getNorte().entrar(ea);}
	public void irAlNorEste(EnteAutonomo ea) {this.getNoreste().entrar(ea);}
	public void irAlNorOeste(EnteAutonomo ea) {this.getNoroeste().entrar(ea);}
	
}

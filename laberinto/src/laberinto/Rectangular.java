package laberinto;

public class Rectangular extends Forma {
	private ElementoMapa norte;
	private ElementoMapa sur;
	private ElementoMapa este;
	private ElementoMapa oeste;

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
	
	public void ponerEn(ElementoMapa em,Orientacion or){
		or.ponerElementoEnRectangulo(this, em);
	}
	public void irAlEste(EnteAutonomo ea){this.getEste().entrar(ea);}
	public void irAlNorte(EnteAutonomo ea) {this.getNorte().entrar(ea);}
	public void irAlOeste(EnteAutonomo ea) {this.getOeste().entrar(ea);}
	public void irAlSur(EnteAutonomo ea) {this.getSur().entrar(ea);}

}

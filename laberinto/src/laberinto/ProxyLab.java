package laberinto;

import laberintoBuilder.ParserLabConfig;

public class ProxyLab extends LaberintoAC {
	private Laberinto laberinto;
	private String nom;
	public void setLaberinto(Laberinto lab){
		laberinto=lab;
	}
	Laberinto getLaberinto(){
		return laberinto;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void entrar(EnteAutonomo ea){
		ParserLabConfig director;
		if (laberinto==null){
			director = new ParserLabConfig();
			director.procesar(nom);
			laberinto=director.obtenerLaberinto();
			Habitacion hab=laberinto.habitaciones.get(0);
			hab.entrar(ea);
		}
	}
}

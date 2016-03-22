package laberintoBuilder;
import laberinto.*;

public abstract class LaberintoBuilderAC {
	public void construirLaberinto(){}
	public Habitacion construirHabitacion(){return null;}
	public Armario construirArmario(Contenedor con){return null;}
	public void construirJuego(){}
	public void construirBicho(String es,int num){}
	public void construirPuerta(int num1,String or1,int num2,String or2){}
	public void iniOrientaciones(){}
	public void construirBomba(Contenedor con){}
	public JuegoLaberinto obtenerJuego() {return null;}
	public void construirBlackHole(Contenedor padre, String nom) {}
	public Laberinto obtenerLaberinto() {return null;	}
	public void fabricarPuerta(int num1,String or1,int num2,String or2){}

}

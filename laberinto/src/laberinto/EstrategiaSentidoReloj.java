package laberinto;

public class EstrategiaSentidoReloj extends Estrategia {
	//private EnteAutonomo bicho;
	private int actual;
	EstrategiaSentidoReloj(){
		this.actual=0;
	}
	Orientacion siguiente(){
		this.actual=(this.actual+1)%orientaciones.size();
		return orientaciones.get(this.actual);
	}
	void caminar(){
		//this.bicho=bicho;
		Orientacion or=siguiente();
		or.entrar(this.bicho);
	}
	void dormir(){
		try{
			System.out.println("Hilo durmiendo zzzzz");
			Thread.sleep(3000);
			}
		catch(InterruptedException e){
			System.out.println("Hilo interrumpido");
		}
	}
}

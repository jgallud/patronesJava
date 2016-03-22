package laberinto;

public class BlackHole extends Hoja {
	ProxyLab proxyLab;
	String nombreConfig;
	public BlackHole(){
		proxyLab=new ProxyLab();
	}
	public void entrar(EnteAutonomo ea){
		proxyLab.setNom(nombreConfig);
		proxyLab.entrar(ea);
	}
	public void setFilename(String filename) {
		nombreConfig=filename;
	}
	String getFilename(){return nombreConfig;}
}

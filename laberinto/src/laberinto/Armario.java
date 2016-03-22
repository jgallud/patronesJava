package laberinto;

public class Armario extends Contenedor {

	public void listarElementos() {
		System.out.println("Elemento contenedor: ");
		for(int i=0;i<hijos.size();i++){
			hijos.get(i).listarElementos();
		}
	}
}


public class Canasta {
	public int totalCanasta = 0;
	Articulo[] listaArticulo = new Articulo [10]; 
	public double calcularTotal(){
		for (int i=0; i<listaArticulo.length; i++) {
		      totalCanasta=listaArticulo[i].calcularArticulo();
		    } 
		return totalCanasta;	
	}
	public void agregarArticuloALista(Articulo articulo){
		listaArticulo[listaArticulo.length]=articulo;
	}
	

}

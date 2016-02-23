
public class Canasta {
	public int totalCanasta = 0;
	public int totalArticulos = 0;
	Articulo[] listaArticulo = new Articulo [10]; 
	public Canasta(){}
	public double calcularTotal(){
		for (int i=0; i<totalArticulos; i++) {
		      totalCanasta=listaArticulo[i].calcularArticulo();
		    } 
		return totalCanasta;	
	}
	public void agregarArticuloALista(Articulo articulo){
		listaArticulo[totalArticulos]=articulo;
		totalArticulos+=1;
	}
	public int cuantosArticulos(){
		return totalArticulos;
	}
	

}

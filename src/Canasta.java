
public class Canasta {
	public double totalCanasta = 0;
	public int totalArticulos = 0;
	public int totalServicios = 0;
	Articulo[] listaArticulo = new Articulo [10]; 
	Servicio[] listaServicios = new Servicio [10];
 	
	
	public Canasta(){}
 	
 	
	public double calcularTotal(){
		if (totalArticulos!=0)
		{
		for (int i=0; i<totalArticulos; i++) {
		      totalCanasta=listaArticulo[i].calcularArticulo();
		    }
		}
		if (totalServicios!=0)
		{
		for (int j=0; j<totalServicios; j++) {
		      totalCanasta=listaServicios[j].calcularTotalServicio();
		    } 		
		}
		return totalCanasta;	
	}
	
	
	public void agregarArticuloALista(Articulo articulo){
		listaArticulo[totalArticulos]=articulo;
		totalArticulos+=1;
	}
	
	
	public void agregarServicioALista(Servicio service){
		listaServicios[totalServicios]=service;
		totalServicios+=1;
	}
	
	public int cuantosArticulos(){
		return totalArticulos;
	}
	public int cuantosServicios(){
		return totalServicios;
	}
	

}


public class Articulo {
	public int cantidad=0;
	public int precio = 0;
	
	public Articulo(){
		this.cantidad=0;
		this.precio=0;	
	}
	
	public Articulo( int cantidad, int precio){
		this.cantidad=cantidad;
		this.precio=precio;	
	}
	
	public int calcularArticulo() {
		return cantidad*precio;
	}

}

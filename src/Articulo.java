
public class Articulo {
	public double cantidad=0;
	public double precio = 0;
	
	public Articulo(){
		this.cantidad=0;
		this.precio=0;	
	}
	
	public Articulo( double cantidad, double precio){
		this.cantidad=cantidad;
		this.precio=precio;	
	}
	
	public double calcularArticulo() {
		return cantidad*precio;
	}

}

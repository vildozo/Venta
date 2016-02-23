
public class Venta {

	public Object calcularArticulo(int cantidad, double precio) {
		return cantidad*precio;
	}

	public Object calcularServicio(double cantidadHoras, double CostoPorHora) {
		return cantidadHoras*CostoPorHora*0.2;
	}

	public Object calcularTotalVenta(double totalArticulo, double totalSevicio) {
		return totalArticulo+totalSevicio;
	}
}

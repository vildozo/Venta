
public class Servicio {
	public double cantidadHoras=0.0;
	public double precioPorHora = 0.0;
	
	public Servicio(){
		this.cantidadHoras=0.0;
		this.precioPorHora=0.0;
	}
	
	public Servicio(double cantidadHoras, double precioPorHora){
		this.cantidadHoras = cantidadHoras;
		this.precioPorHora = precioPorHora;
	}
	
	public double calcularTotalServicio(){
		return cantidadHoras*precioPorHora*0.2;
	}
	
}

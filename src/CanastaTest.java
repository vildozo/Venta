import static org.junit.Assert.*;

import org.junit.Test;


public class CanastaTest {
	
	@Test
	public void niArticulosNiServicios() {
		Canasta basquet = new Canasta();
		assertEquals(0.0,basquet.calcularTotal(),0.01);	
	}
	
	@Test
	public void CeroArticulo() {
		Canasta basquet = new Canasta();
		assertEquals(0,basquet.cuantosArticulos());	
	}
	
	@Test
	public void CeroServicio() {
		Canasta basquet = new Canasta();
		assertEquals(0,basquet.cuantosServicios());	
	}
	
	@Test
	public void AgregarArticulo() {
		Canasta basquet = new Canasta();
		Articulo a = new Articulo(4,3);
		basquet.agregarArticuloALista(a);
		assertEquals(1,basquet.cuantosArticulos());	
	}
	
	@Test
	public void AgrearServicio() {
		Canasta basquet = new Canasta();
		Servicio service = new Servicio(4,3);
		basquet.agregarServicioALista(service);
		assertEquals(1,basquet.cuantosServicios());	
	}
	
	@Test
	public void CalcularTotalde1Articulo() {
		Canasta basquet = new Canasta();
		Articulo a = new Articulo(4,3);
		basquet.agregarArticuloALista(a);
		assertEquals(12.00,basquet.calcularTotal(),0.01);	
	}
	
	@Test
	public void CalcularTotalde1Servicio() {
		Canasta basquet = new Canasta();
		Servicio service = new Servicio(4,3);
		basquet.agregarServicioALista(service);
		assertEquals(2.4,basquet.calcularTotal(),0.01);	
	}
	
	@Test
	public void CalcularTotalde1Servicio1Articulo() {
		Canasta basquet = new Canasta();
		Servicio service = new Servicio(4,3);
		Articulo a = new Articulo(4,3);
		basquet.agregarArticuloALista(a);
		basquet.agregarServicioALista(service);
		assertEquals(14.4,basquet.calcularTotal(),0.01);	
	}
	
	@Test
	public void CalcularTotalde2Servicio() {
		Canasta basquet = new Canasta();
		Servicio service1 = new Servicio(4,3);
		Servicio service2 = new Servicio(4,3);
		basquet.agregarServicioALista(service1);
		basquet.agregarServicioALista(service2);
		assertEquals(4.8,basquet.calcularTotal(),0.01);	
	}
	
	@Test
	public void CalcularTotalde2Articulo() {
		Canasta basquet = new Canasta();
		Articulo articulo1 = new Articulo(4,3);
		Articulo articulo2 = new Articulo(4,3);
		basquet.agregarArticuloALista(articulo1);
		basquet.agregarArticuloALista(articulo2);
		assertEquals(24.00,basquet.calcularTotal(),0.01);	
	}
	
	@Test
	public void CalcularTotalde2Servicio2Articulo() {
		Canasta basquet = new Canasta();
		Servicio service1 = new Servicio(4,3);
		Servicio service2 = new Servicio(4,3);
		Articulo articulo1 = new Articulo(4,3);
		Articulo articulo2 = new Articulo(4,3);
		basquet.agregarArticuloALista(articulo1);
		basquet.agregarArticuloALista(articulo2);
		basquet.agregarServicioALista(service1);
		basquet.agregarServicioALista(service2);
		
		assertEquals(28.8,basquet.calcularTotal(),0.01);	
	}
	
	

}

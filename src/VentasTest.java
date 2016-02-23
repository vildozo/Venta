import static org.junit.Assert.*;
import org.junit.Test;

public class VentasTest {
	
	@Test
	public void calcularArticulo(){
		Venta venta =  new Venta();
		assertEquals(0.0,venta.calcularArticulo(0,0));
		assertEquals(45.0,venta.calcularArticulo(3,15));
		assertEquals(120.0,venta.calcularArticulo(10,12));
		assertEquals(44.0,venta.calcularArticulo(8,5.5));
	}
	@Test
	public void calcularServicio(){
		Venta venta =  new Venta();
		assertEquals(0.0,venta.calcularServicio(0,25));
		assertEquals(0.0,venta.calcularServicio(0,0));
		assertEquals(32.0,venta.calcularServicio(8,20));
		assertEquals(14.5,venta.calcularServicio(5,14.5));
		assertEquals(15.4,venta.calcularServicio(5.5,14));
	}
	
//	@Test
//	public void calcularTotalVenta(){
//		Venta venta =  new Venta();
//		assertEquals(77.0,venta.calcularTotalVenta(venta.calcularArticulo(3,15),venta.calcularServicio(8,20)));
//	}
}

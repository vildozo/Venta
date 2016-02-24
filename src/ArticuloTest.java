import static org.junit.Assert.*;

import org.junit.Test;


public class ArticuloTest {

	@Test
	public void noHayArticulo(){
		Articulo articulo =  new Articulo();
		assertEquals(0,articulo.calcularArticulo(),0.01);
		
	}
	
	@Test
	public void calcularArticulo(){
		Articulo articulo =  new Articulo(4,3);
		assertEquals(12,articulo.calcularArticulo(),0.01);
		
	}
	
	@Test
	public void calcularArticuloConDecimal(){
		Articulo articulo =  new Articulo(4,3.5);
		assertEquals(14,articulo.calcularArticulo(),0.01);
		
	}
	

}

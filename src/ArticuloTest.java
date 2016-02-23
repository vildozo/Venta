import static org.junit.Assert.*;

import org.junit.Test;


public class ArticuloTest {

	@Test
	public void noHayArticulo(){
		Articulo articulo =  new Articulo();
		assertEquals(0,(articulo.calcularArticulo()));
		
	}
	
	@Test
	public void calcularArticulo(){
		Articulo articulo =  new Articulo(4,3);
		assertEquals(12,(articulo.calcularArticulo()));
		
	}
	

}

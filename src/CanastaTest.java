import static org.junit.Assert.*;

import org.junit.Test;


public class CanastaTest {

	@Test
	public void test() {
		Canasta basquet = new Canasta();
		Articulo a = new Articulo(4,3);
		basquet.agregarArticuloALista(a);
		assertEquals(1,basquet.cuantosArticulos());
		
	}

}

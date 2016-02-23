import static org.junit.Assert.*;

import org.junit.Test;


public class ServicioTest {

	
	
	@SuppressWarnings("deprecation")
	@Test
	public void noHayServicio() {
		Servicio service = new Servicio();
		assertEquals(0.0,service.calcularTotalServicio());
	}

}

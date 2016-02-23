import static org.junit.Assert.*;

import org.junit.Test;


public class ServicioTest {

	
	
	@SuppressWarnings("deprecation")
	@Test
	public void noHayServicio() {
		Servicio service = new Servicio();
		double res = service.calcularTotalServicio();
		assertEquals(0.0,res,0.01);
	}

}

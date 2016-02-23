import static org.junit.Assert.*;

import org.junit.Test;


public class ServicioTest {


	@Test
	public void noHayServicio() {
		Servicio service = new Servicio();
		double res = service.calcularTotalServicio();
		assertEquals(0.0,res,0.01);
	}
	
	@Test
	public void UnServicio() {
		Servicio service = new Servicio(4,8.5);
		double res = service.calcularTotalServicio();
		assertEquals(6.8,res,0.01);
	}

}

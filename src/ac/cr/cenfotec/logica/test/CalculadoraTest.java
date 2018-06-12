package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ac.cr.cenfotec.logica.CalculadoraSalarial;
import ac.cr.cenfotec.logica.TipoEmpleado;

public class CalculadoraTest {

	CalculadoraSalarial cal = new CalculadoraSalarial();

	@Test
	public void salario1() throws Exception {
		assertEquals(1360.0, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, (float) 2000, (float) 8), 0.0f);
	}

	@Test
	public void salario2() throws Exception {
		assertEquals(1260.0, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, (float) 1500, (float) 3), 0.0f);
	}

	@Test
	public void salario3() throws Exception {
		assertEquals(1100.0, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, (float) 1499.99, (float) 0), 0.0f);
	}

	@Test
	public void salario4() throws Exception {
		assertEquals(1760.0, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, (float) 1250, (float) 8), 0.0f);
	}

	@Test
	public void salario5() throws Exception {
		assertEquals(1600.0, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, (float) 1000, (float) 0), 0.0f);
	}

	@Test
	public void salario6() throws Exception {
		assertEquals(1560.0, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, (float) 999.99, (float) 3), 0.0f);
	}

	@Test
	public void salario7() throws Exception {
		assertEquals(1500.0, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, (float) 500, (float) 0), 0.0f);
	}

	@Test
	public void salario8() throws Exception {
		assertEquals(1660.0, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, (float) 0, (float) 8), 0.0f);
	}

	@Test(expected = Exception.class)
	public void salario9() throws Exception {
		assertEquals(0, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, (float) -1, (float) 8), 0.0f);
	}

	@Test(expected = Exception.class)
	public void salario10() throws Exception {
		assertEquals(0, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, (float) 1500, (float) -1), 0.0f);
	}

	@Test(expected = Exception.class)
	public void salario11() throws Exception {
		assertEquals(0, cal.calculaSalarioBruto(null, (float) 1500, (float) 8), 0.0f);
	}

}

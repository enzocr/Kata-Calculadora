package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.AnnoBisiesto;

public class AnnoBisiestoTest {

	static AnnoBisiesto anio;

	@Before
	public void init() {
		System.out.println("Inicializando");
		anio = new AnnoBisiesto();
	}

	/*
	 * 
	 * @Test public void itIsBisiesto() { assertTrue("Es bisiesto",
	 * anio.isBisiesto(2000)); System.out.println("Es bisiesto"); }
	 * 
	 * @Test public void itIsNotBisiesto() { assertFalse("No es bisiesto",
	 * anio.isBisiesto(2005)); System.out.println("Es bisiesto"); }
	 */
	
	@Test
	public void multipleOf4() {
		assertTrue(anio.isBisiesto(1996));
		assertFalse(anio.isBisiesto(1997));
	}

	@Test
	public void multipleOf4And100() {
		assertFalse(anio.isBisiesto(1900));
		assertFalse(anio.isBisiesto(2100));
	}

	@Test
	public void multipleOf400() {
		assertTrue(anio.isBisiesto(1600));
		assertTrue(anio.isBisiesto(2000));
	}

}

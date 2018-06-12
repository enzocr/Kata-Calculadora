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
	
	@Test
	public void isBisiesto() {
		assertTrue(anio.multiploDeCien(2100));
		assertFalse(anio.multiploDeCuatro(1955));
	}

	@Test
	public void multipleOf4() {
		assertTrue(anio.multiploDeCuatro(1996));
		assertFalse(anio.multiploDeCuatro(1997));
	}

	@Test
	public void multipleOf4And100() {
		assertTrue(anio.multiploDeCuatro(1900));
		assertTrue(anio.multiploDeCien(2100));
	}

	@Test
	public void multipleOf400() {
		assertTrue(anio.multiploDeCuatrocientos(1600));
		assertTrue(anio.multiploDeCuatrocientos(2000));

	}

}

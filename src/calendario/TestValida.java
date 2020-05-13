package calendario;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestValida.
 */
public class TestValida {

	/**
	 * Test valida 1.
	 */
	@Test
	public void testValida1() {
		assertFalse(Calendario.valida(1, 1, 1492));
	}
	
	/**
	 * Test valida 2.
	 */
	@Test
	public void testValida2() {
		assertFalse(Calendario.valida(-1, 1, 2020));
	}	
	
	/**
	 * Test valida 3.
	 */
	@Test
	public void testValida3() {
		assertFalse(Calendario.valida(101, 1, 2020));
	}	
	
	/**
	 * Test valida 4.
	 */
	@Test
	public void testValida4() {
		assertFalse(Calendario.valida(1, 0, 2020));
	}	
	
	/**
	 * Test valida 5.
	 */
	@Test
	public void testValida5() {
		assertTrue(Calendario.valida(29, 2, 2020));
	}
	
	/**
	 * Test valida 6.
	 */
	//prova primo commit mauro
	@Test
	public void testValida6() {
		assertTrue(Calendario.valida(29, 2, 2020));
	}
	
	/**
	 * Test valida 7.
	 */
	//prova secondo commit mauro
	@Test
	public void testValida7() {
		assertTrue(Calendario.valida(29, 2, 2020));
	}
}

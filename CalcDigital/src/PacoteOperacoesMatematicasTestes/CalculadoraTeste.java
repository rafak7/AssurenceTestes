package PacoteOperacoesMatematicasTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import PacoteOperacoesMatematicas.CalculadoraJava;

public class CalculadoraTeste {
	
	private CalculadoraJava calc;

	@Before
	public void setUp() throws Exception {
		calc = new CalculadoraJava();
	}

	@Test
	public void testSomar29com23() { 
		int resultado = calc.somar(29,23);
		assertEquals(resultado, 52);
	}
	@Test
	public void testSubtrair29com23() { 
		int resultado = calc.subtrair(29,23);
		assertEquals(resultado, -6);
	}
	@Test
	public void testSubtrair2de5() { 
		int resultado = calc.subtrair(2,5);
		assertEquals(resultado, 3);
	}
	@Test
	public void testDivisao10com2() { 
		float resultado = calc.dividir(5,2);
		assertEquals(resultado, 2.5,0.5);
	}
	@Test
	public void testMultiplicar10com2() { 
		int resultado = calc.multiplicar(10,2);
		assertEquals(resultado, 20);
	}
	

}

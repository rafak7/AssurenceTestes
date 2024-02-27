package PacoteTestes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import PacoteApps.Elevador;

public class CalcTeste {

	private Elevador elevador;
	
	@Before
	public void setUp() throws Exception {
		elevador = new Elevador();

	}
	
	@Test
	public void entrarNoElevador() {
		double resultado = calc.somar(200,30);
		assertEquals(resultado, 230);
	}

}

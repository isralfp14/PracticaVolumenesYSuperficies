package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;
import clases.Cubo;

class testCilindro {

	@Test
	void testSuperficie() {
		Cilindro cili1 = new Cilindro(9, 9);
		int superficieEsperada = 1016;
		int superficieObtenida = cili1.superficie();
		assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cilindro cili1 = new Cilindro(9, 9);
		int volumenEsperado = 2286;
		int volumenObtenido = cili1.volumen();
		assertEquals(volumenEsperado, volumenObtenido);
	}

}

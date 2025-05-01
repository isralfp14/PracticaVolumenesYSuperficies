package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class testCubo {

	@Test
	void testSuperficie() {
		Cubo c1 = new Cubo(3);
		int superficieEsperada = 54;
		int superficieObtenida = c1.superficie();
		assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cubo c1 = new Cubo(3);
		int volumenEsperado = 27;
		int volumenObtenido = c1.volumen();
		assertEquals(volumenEsperado, volumenObtenido);
	}

}

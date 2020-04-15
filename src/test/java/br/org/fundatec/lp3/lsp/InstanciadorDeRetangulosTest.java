package br.org.fundatec.lp3.lsp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InstanciadorDeRetangulosTest {

	@Test
	public void testAreaRetangulo() {
		
		InstanciadorDeRetangulos gerador = new InstanciadorDeRetangulos();
		Retangulo retangulo = gerador.novoRetangulo();
		
		retangulo.setLargura(10);
		retangulo.setAltura(5);
		
		int areaEsperada = 50;

		assertEquals(areaEsperada, retangulo.getArea());

	}

}


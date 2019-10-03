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

	@Test
	public void testAreaDoisRetangulos() {

		InstanciadorDeRetangulos gerador = new InstanciadorDeRetangulos();

		Retangulo primeiroRetangulo = gerador.novoRetangulo();
		Retangulo segundoRetangulo = gerador.novoRetangulo();

		primeiroRetangulo.setLargura(10);
		primeiroRetangulo.setAltura(5);

		segundoRetangulo.setLargura(6);
		segundoRetangulo.setAltura(5);

		int areaEsperadaPrimeiroRetangulo = 50;
		int areaEsperadaSegundoRetangulo = 30;

		assertEquals(areaEsperadaPrimeiroRetangulo, primeiroRetangulo.getArea());
		assertEquals(areaEsperadaSegundoRetangulo, segundoRetangulo.getArea());

	}

}


package br.org.fundatec.lp3.lsp;

public class InstanciadorDeRetangulos {

	private int ultimoObjeto = 0;

	public Retangulo novoRetangulo() {

		if(ultimoObjeto == 0) {
			ultimoObjeto = 1;
			return new Retangulo();
		} else {
			ultimoObjeto = 0;
			return new Quadrado();
		}
	}

}

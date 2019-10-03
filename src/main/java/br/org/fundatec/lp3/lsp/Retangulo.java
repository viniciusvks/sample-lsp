package br.org.fundatec.lp3.lsp;

public class Retangulo {

	protected int largura;
	protected int altura;

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getArea() {
		return largura * altura;
	}

}

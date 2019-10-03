package br.org.fundatec.lp3.lsp;

public class Quadrado extends Retangulo {

	@Override
	public void setLargura(int largura) {
		this.largura = largura;
		this.altura = largura;
	}

	@Override
	public void setAltura(int altura) {
		this.altura = altura;
		this.largura = altura;
	}

	@Override
	public int getArea() {
		return largura * altura;
	}

}

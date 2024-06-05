package Exemplo2;

public class Retangulo extends Forma {
	public double largura;
	public double altura;
	
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double area() {	
		return largura*altura;
	}

	@Override
	public double perimetro() {
		return 2 * (largura*altura);
	}

}

package Exemplo2;

public class Circulo extends Forma{
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {	
		return 3.14 * (raio*raio);
	}

	@Override
	public double perimetro() {
		return 2 * 3.14 * raio;
	}

}

package Exercicio2;

public class Circulo {
	private float raio;
	
	public Circulo() {
		
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float calculaArea(float raio) {
		float area = (float) (3.14*raio*raio);
		return area;
	}
}

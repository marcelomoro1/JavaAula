package Exercicio5;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo() {
	
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public boolean verificaEquilatero(double ladoA, double ladoB, double ladoC) {
		if (ladoA == ladoB && ladoB == ladoC) {
			return true;
		}else {
			return false;
		}
	}
}

package Exemplo3;
//Exemplo de sobrecarga
public class Calculadora {
	public int somar (int x, int y) {
		return x + y;
	}
	public int somar(int x, int y, int z) {
		return x + y + z;
	}
	public double somar(double x, double y, double z) {
		return x + y + z;
	}
	
	public int mult(int x, int y) {
		return x * y;
	}
	public double mult(double x, double y) {
		return x * y;
	}
}

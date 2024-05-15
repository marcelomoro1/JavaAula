package Exemplo3;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int resultado1 = c.somar(10, 15);
		int resultado2 = c.somar(10, 15, 20);
		System.out.println("Resultado 1: "+resultado1);
		System.out.println("Resultado 2: "+resultado2);
		double resultado3 = c.somar(4.4, 8, 42);
		System.out.println("Resultado 3: "+resultado3);
		int resultado4 = c.mult(10, 15);
		double resultado5 = c.mult(4.45, 5);
		System.out.println("Resultado 4: "+resultado4);
		System.out.println("Resultado 5: "+resultado5);
	}

}

package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo("Azul", false, 0, 0);
		r1.setAltura(4.5);
		r1.setLargura(3.65);
		System.out.println("Area do retangulo eh: "+r1.calcularArea());
	}

}

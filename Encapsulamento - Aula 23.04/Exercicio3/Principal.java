package Exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		System.out.println("Digite a base e a altura do retangulo");
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		r.setAltura(altura);
		r.setBase(base);
		double area = r.calculaArea(base, altura);
		
		System.out.println("A base eh: "+r.getBase());
		System.out.println("A altura eh: "+r.getAltura());
		System.out.println("A area eh: "+area);
		sc.close();

	}

}

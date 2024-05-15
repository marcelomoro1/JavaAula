package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quer um retangulo - 1? ou um Triangulo - 2?");
		int op;
		double resultado;
		FormaGeometrica forma;
		op = sc.nextInt();
		if (op==1) {
			forma = new FormaGeometrica();
			resultado = forma.calcularArea(5, 4);
			System.out.println("Area do retangulo 5 por 4 eh: "+resultado);
		}
		else if (op==2) {
			forma = new Triangulo();
			resultado = forma.calcularArea(5, 4);
			System.out.println("Area do triangulo de base 5 com altura 4 eh: "+resultado);
		}else {
			System.out.println("Numero invalido");
		}
		sc.close();
	}

}

package Exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo t = new Triangulo();
		
		System.out.println("Digite o lado 1, lado 2 e lado 3 do triangulo");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		
		t.setLadoA(lado1);
		t.setLadoB(lado2);
		t.setLadoC(lado3);
		
		System.out.println("O lado 1 eh:"+t.getLadoA());
		System.out.println("O lado 2 eh:"+t.getLadoB());
		System.out.println("O lado 3 eh:"+t.getLadoC());
		
		boolean equilatero = t.verificaEquilatero(lado1, lado2, lado3);
		
		System.out.println("O triangulo eh equilatero? "+equilatero);
		sc.close();
	}

}

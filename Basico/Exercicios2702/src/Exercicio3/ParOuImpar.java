package Exercicio3;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		n = teclado.nextInt();		
		teclado.close();

		if (n%2==0)
			System.out.println("O numero "+n+" eh par");
		else
			System.out.println("O numero "+n+" eh impar");
		
		
		

	}

}

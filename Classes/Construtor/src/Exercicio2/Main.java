package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual construtor vc gostaria de utilizar Digite 1 ou 2?");
		int n = teclado.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Digite o nome e a idade");
			Pessoa p1 = new Pessoa(teclado.next(),teclado.nextInt());
			break;
			
		case 2:
			System.out.println("Digite a idade");
			Pessoa p2 = new Pessoa(teclado.nextInt());
			break;
			
		default:
			System.out.println("vAPO VAPO");
			break;

		}

	}

}

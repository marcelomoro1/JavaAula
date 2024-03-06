package Exercicios;

import java.util.Scanner;

//Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite uma cidade");
			String n = teclado.nextLine();

			if(n.equals("São Paulo")) {
				System.out.println("VAPO");
				break;
			}
		}
		teclado.close();
	}

}

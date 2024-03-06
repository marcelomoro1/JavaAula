package Exercicios;

import java.util.Scanner;

//Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite uma nota");
			int n = teclado.nextInt();

			if(n==-1) {
				break;
			}
		}
		teclado.close();
	}

}

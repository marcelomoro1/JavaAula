package Exercicios;

import java.util.Scanner;

//Escreva um programa Java que use um laço para ler uma sequência de números inteiros 
//do usuário até que o número 0 seja lido.
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite um numero");
			int n = teclado.nextInt();

			if(n==0) {
				break;
			}
		}
		teclado.close();
	}

}

package Exercicios;

import java.util.Scanner;

//Escreva um programa Java que use um laço para calcular a média de vários 
//números reais lidos do usuário até que seja lido o número 0.
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for(double i=1;;i++) {
			System.out.println("Digite um numero real");
			double n = teclado.nextDouble();
			double media = 0;
			if(n!=0) {
				media = media + (n/i);				
				System.out.println(media);
			}
			else {
				System.out.println(media);
			}

		}

	}

}

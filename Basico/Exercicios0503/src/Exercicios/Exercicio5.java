package Exercicios;
import java.util.Scanner;

//Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.
public class Exercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n = teclado.nextInt();
		teclado.close();
		int fatorial = 1;
		for(int i = 1;i<=n;i++) {
			fatorial = fatorial * i;
		}
		System.out.println("O fatorial eh: "+fatorial);
	}
	
}

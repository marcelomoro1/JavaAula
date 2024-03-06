package Exercicios;

import java.util.Scanner;

//Faça um programa em Java que leia um número inteiro n, inteiro e positivo e 
//mostre a seguinte soma: S = 1 + 1/2 + 1/3 + 1/4 + 1/5 .... 1/n
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero ");
		int n = teclado.nextInt();
		
		float soma = 0;
		for(float i=1;i<=n;i++) {
			soma = soma + (1/i);
		}
		System.out.println(soma);

	}

}

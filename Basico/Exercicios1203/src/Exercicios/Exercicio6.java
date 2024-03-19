package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
//Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor.

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int maior = -9999;
		int menor = 10000;
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			numeros[i]= teclado.nextInt();
		}
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]>maior) {
				maior = numeros[i];
			}
			if(numeros[i]<menor) {
				menor = numeros[i];
			}
		}
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		
		teclado.close();
	}

}

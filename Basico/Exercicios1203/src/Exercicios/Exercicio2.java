package Exercicios;

import java.util.Scanner;

//Escreva um algoritmo que leia os valores para um vetor de 10 elementos e então mostre na tela a quantidade de números pares e ímpares.
public class Exercicio2 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			numeros[i]= teclado.nextInt();
		}
		int par =0;
		int impar=0;
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Pares: "+par +" Impares: "+ impar);
		teclado.close();
	}

}

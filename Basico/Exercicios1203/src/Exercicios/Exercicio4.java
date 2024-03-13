package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
//Fazer um algoritmo que leia dez números inteiros armazenando-os em um vetor e escreva primeiramente todos os números pares lidos e após todos os ímpares
	public static void main(String[] args) {
		int[] numeros = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			numeros[i]= teclado.nextInt();
		}
		System.out.println("Pares: ");
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				System.out.println(numeros[i]+" ");
			}
		}
		System.out.println("Impares: ");
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]%2!=0) {
				System.out.println(numeros[i]+" ");
			}
		}		
		teclado.close();

	}

}

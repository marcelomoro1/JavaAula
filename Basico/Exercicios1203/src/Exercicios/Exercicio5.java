package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
//Fazer um algoritmo que leia trinta números reais armazenando-os em um vetor e após escreva a posição de cada número menor que zero desse vetor
	public static void main(String[] args) {
		float[] numeros = new float[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			numeros[i]= teclado.nextFloat();
		}
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i]<0) {
				System.out.println("Elemento "+numeros[i] + " Posicao: "+i);
			}
		}		
		
		
		teclado.close();
	}

}

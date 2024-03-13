package Exercicios;
//Escreva um algoritmo que leia valores para dois vetores de 20 elementos e então realize a soma dos elementos da mesma posição, armazenando o resultado em um outro vetor.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] vetor1 = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<vetor1.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			vetor1[i]= teclado.nextInt();
		}
		
		int[] vetor2 = new int[10];
		for(int i = 0;i<vetor2.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			vetor2[i]= teclado.nextInt();
		}
		int[] vetor3 = new int[10];	
		for(int i = 0;i<vetor3.length;i++) {
			vetor3[i]= vetor1[i]+vetor2[i];
		}			
		
		for(int i = 0;i<vetor3.length;i++) {
			System.out.println(vetor3[i]+" ");
		}
		teclado.close();
	}

}

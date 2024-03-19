package Exercicios;

import java.util.Scanner;

//Escreva um programa em Java que faça leitura dos valores de uma matriz 5x5. Em seguida apresente os valores da diagonal principal. Na sequência, apresente os valores da diagonal secundária
public class Exercicio9 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int[] vetor1 = new int[5];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				System.out.println("I ["+(i)+"] J ["+(j)+"] Valor:");
				matriz[i][j] = teclado.nextInt();
				if (i==j) { //Entao e diagonal princiapl
					vetor1[i]=matriz[i][j];
				}
				
			}
		}
		//Valores da diagonal principal
		System.out.println("Diagonal principal");
		for(int i = 0; i<vetor1.length;i++) {
			System.out.print(vetor1[i] + " ");
		}
		
		System.out.println();
		//Valores da diagonal secundaria
		System.out.println("Diagonal secundaria");
		for(int i = 0; i<matriz.length;i++) {
			System.out.print(matriz[i][matriz.length - i - 1] + " ");
		}
	
		teclado.close();

	}

}

package Exercicios;

import java.util.Scanner;

//Escreva um programa em Java que leia os valores de uma matriz 4x3, e em seguida mostre na tela apenas os valores cuja soma dos índices (i+j) seja um número par.
public class Exercicio8 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][3];
		Scanner teclado = new Scanner(System.in);

		for(int i=0;i<4;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println("I ["+(i+1)+"] J["+(j+1)+"] valor:");
				matriz[i][j] = teclado.nextInt();
				if((i+j)%2==0){//soma dos indices i+j for par
					System.out.println("Soma de i+j eh par, valor: "+matriz[i][j]);
				}
			
			}
		}

		
		teclado.close();

	}

}

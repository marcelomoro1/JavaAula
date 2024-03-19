package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
//Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina.
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4];
		Scanner teclado = new Scanner(System.in);
		int maior, menor;
		maior = -99999;
		menor = 999999;
		for(int i=0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				System.out.println("Aluno ["+(i+1)+"] disciplina["+(j+1)+"] nota:");
				matriz[i][j] = teclado.nextInt();
				if(matriz[i][j]>maior) {
					maior = matriz[i][j];
				}
				if(matriz[i][j]<menor) {
					menor = matriz[i][j];
				}				
			}
		}
		System.out.println("Menor nota eh: "+menor);		
		System.out.println("Maior nota eh: "+maior);
	
		
		teclado.close();
	}

}

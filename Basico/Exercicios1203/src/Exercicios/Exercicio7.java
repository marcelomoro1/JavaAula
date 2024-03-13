package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
//Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina.
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4];
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				System.out.println("Digite aluno ["+i+"]disciplina["+j+"]:");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		teclado.close();
	}

}

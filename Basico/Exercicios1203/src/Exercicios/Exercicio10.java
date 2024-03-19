package Exercicios;

import java.util.Scanner;

//No exercício anterior altere para que verifique se a soma dos elementos da diagonal principal é igual a soma dos elementos da diagonal secundária.
public class Exercicio10 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int[] vetor1 = new int[5];
		int somaprincipal = 0;
		int somasecundaria = 0;
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				System.out.println("I ["+(i)+"] J ["+(j)+"] Valor:");
				matriz[i][j] = teclado.nextInt();
				if (i==j) { //Entao e diagonal principal
					vetor1[i]=matriz[i][j];
					somaprincipal = somaprincipal + matriz[i][j];
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
			somasecundaria = somasecundaria + (matriz[i][matriz.length - i - 1]);
			System.out.print(matriz[i][matriz.length - i - 1] + " ");
		}
		teclado.close();
		System.out.println();
		System.out.println("Valor da soma da diag principal: "+somaprincipal);
		System.out.println("Valor da soma da diag secundaria: "+somasecundaria);
		if(somaprincipal==somasecundaria) {
			System.out.println("A soma dos elementos das diagonais sao iguais ");
		}
		else {
			System.out.println("A soma dos elementos nao sao iguais");
		}

	}

}

package Exercicios;

import java.util.Scanner;

public class MatrizExemplo {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<matriz.length;i++) {
			for(int j = 0;j<matriz.length;j++) {
				System.out.println("Digite o elemento ["+i+"]["+j+"]:");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
//		for(int i=0;i<matriz.length;i++) {
//			for(int j = 0;j<matriz.length;j++) {
//				System.out.println(matriz[i][j]+ " ");
//			}
//		}
		for(int[] linha:matriz) {
			for(int elemento:linha) {
				System.out.println("Elemento: "+ elemento);
			}
		}
		
		
		
		teclado.close();

	}

}

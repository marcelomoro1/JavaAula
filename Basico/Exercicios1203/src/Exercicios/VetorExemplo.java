package Exercicios;

import java.util.Scanner;

public class VetorExemplo {

	public static void main(String[] args) {
		int[] numeros = new int[2];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			numeros[i]= teclado.nextInt();
		}
		
		for(int i =0; i<numeros.length;i++) {
			System.out.println("O elemento "+(i+1)+" vale: "+numeros[i]);
		}
		
		numeros = new int[3];
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Digite o elemento "+(i+1));
			numeros[i]= teclado.nextInt();
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.println("O elemento de indice "+(i+1)+" eh "+numeros[i]);			
		}
		teclado.close();
	}

}

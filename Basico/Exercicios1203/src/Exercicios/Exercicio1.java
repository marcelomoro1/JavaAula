package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	// Fazer um algoritmo que leia dez números e escreva-os na ordem contrária à ordem de leitura.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n[] = new int[10];
		for(int i =0;i<10;i++) {
			System.out.println("Digite o numero "+(i+1));
			n[i] = teclado.nextInt();
		}
		for(int i = 9;i>=0;i--) {
			System.out.println(n[i]+ " ");
		}
		teclado.close();
	}

}

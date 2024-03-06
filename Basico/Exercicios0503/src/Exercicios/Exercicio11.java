package Exercicios;

import java.util.Random;

//Escreva um programa em Java que gera números entre 1000 e 1999 e
//mostra aqueles que divididos por 11 dão resto 5.

public class Exercicio11 {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i=1000;i<=1999;i++) {
			int num = random.nextInt(1000)+1000;
			if(num%11==5){
				System.out.println(num);
			}
		}
	}

}

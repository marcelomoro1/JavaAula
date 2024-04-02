package Exercicio4;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		RealizaConta conta = new RealizaConta();
		
		System.out.println("Digite dois valores para soma");
		double soma = conta.soma(teclado.nextDouble(), teclado.nextDouble());
		System.out.println("Soma eh: "+soma);
	
		System.out.println("Digite dois valores para subtracao");
		double subtracao = conta.subtracao(teclado.nextDouble(), teclado.nextDouble());
		System.out.println("Subtracao eh: "+subtracao);
		
		System.out.println("Digite dois valores para divisao");
		double divisao = conta.div(teclado.nextDouble(), teclado.nextDouble());
		System.out.println("Divisao eh: "+divisao);
		
		System.out.println("Digite dois valores para multiplicacao");
		double multiplicacao = conta.mult(teclado.nextDouble(), teclado.nextDouble());
		System.out.println("Divisao eh: "+multiplicacao);		
		teclado.close();
	}

}

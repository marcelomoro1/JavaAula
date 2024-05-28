package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite o valor q esta na conta");
		Scanner sc = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria();
		c1.setValor(sc.nextDouble());
		System.out.println("Valor na conta: "+c1.getValor());
		System.out.println("Deposito normal: ");
		c1.depositar(500.0);
		System.out.println("Valor na conta: "+ c1.getValor());
		Cheque q = new Cheque();
		q.setValor(200);
		System.out.println("Deposito de cheque: ");
		c1.depositar(q.getValor());
		System.out.println("Valor na conta: "+ c1.getValor());
		sc.close();
	}

}

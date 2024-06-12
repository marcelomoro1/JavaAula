package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto voce quer depositar?");
		double deposito = sc.nextDouble();
		System.out.println("Quanto voce quer sacar?");
		double saque = sc.nextDouble();
		
		ContaCorrente conta = new ContaCorrente(0.0,500.0);
		
		System.out.println("Saldo: "+conta.getSaldo());
		System.out.println("Limite: "+conta.getLimite());
	
		conta.depositar(deposito);
		conta.sacar(saque);
		
		System.out.println("Saldo: "+conta.getSaldo());
		System.out.println("Limite: "+conta.getLimite());
		
		sc.close();
	}

}

package Exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		System.out.println("Digite o o saldo e o limite da conta");
		float saldo = sc.nextFloat();
		float limite = sc.nextFloat();
		conta.setLimite(limite);
		conta.setSaldo(saldo);
		
		System.out.println("Saldo: "+conta.getSaldo());
		System.out.println("Limite: "+conta.getLimite());
		
		System.out.println("Quanto voce quer sacar?");
		float saque = sc.nextFloat();
		conta.sacar(saque);
		sc.close();
	}

}

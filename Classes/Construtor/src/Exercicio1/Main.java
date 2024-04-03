package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		ContaCorrente novaConta = new ContaCorrente();
		
		System.out.println("Definir saldo inicial");
		conta.definirSaldoInicial(teclado.nextFloat());
		System.out.println("Valor na conta: "+conta.Saldo);
		
		System.out.println("Defina um valor para deposito");
		conta.depositar(teclado.nextFloat());
		System.out.println("Valor na conta: "+conta.Saldo);
		
		System.out.println("Defina um valor para saque");
		conta.sacar(teclado.nextFloat());
		System.out.println("Valor na conta: "+conta.Saldo);
		
		System.out.println("NOVA CONTA");
		novaConta.definirSaldoInicial(1000);
		System.out.println("Deposito realizado! Valor na conta: "+novaConta.Saldo);
		novaConta.sacar(500);
		System.out.println("Saque realizado! Valor na conta: "+novaConta.Saldo);	
		novaConta.depositar(50);
		System.out.println("Deposito realizado! Valor na conta: "+novaConta.Saldo);
		novaConta.sacar(600);
		System.out.println("Valor na conta: "+novaConta.Saldo);
		teclado.close();
	}

}

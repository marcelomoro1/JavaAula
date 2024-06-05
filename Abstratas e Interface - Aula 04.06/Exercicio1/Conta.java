package Exercicio1;

public abstract class Conta {
	protected double saldo;
	protected double limite;
	
	public abstract double depositar();
	public abstract double sacar();
}

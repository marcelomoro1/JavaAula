package Exercicio1;

public abstract class Conta {
	protected double saldo=0;
	protected double limite=0;
	
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}

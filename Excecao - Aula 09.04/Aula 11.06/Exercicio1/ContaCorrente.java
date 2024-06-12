package Exercicio1;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	@Override
	public void depositar(double valor) {
		if (valor<0) {
			throw new IllegalArgumentException("Deposito negativo.");		
		}
		else {
	        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");	
			this.saldo = this.saldo + valor;		
		}
	}

	@Override
	public void sacar(double valor) {
		if(valor>(this.saldo+this.limite)) {
            throw new IllegalArgumentException("Saldo insuficiente.");
		}
		else {			
			this.saldo = this.saldo - valor;
	        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
		}

	}

}

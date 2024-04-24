package Exercicio1;

public class ContaBancaria {
	private float saldo;
	private float limite;
	
	public ContaBancaria() {
		
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void sacar(float valor) {
		if (valor>this.limite) {
			System.out.println("Voce nao possui limite");
		}
		else {
			this.saldo = this.saldo-valor;
			System.out.println("Saque efetuado com sucesso. Saldo atual: "+this.saldo);
		}
	}

	
}

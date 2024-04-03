package Exercicio1;

public class ContaCorrente {
	public float Saldo;
	
	public float definirSaldoInicial(float saldo) {
		return this.Saldo = saldo;
	}
	
	public float depositar(float saldo) {
		return this.Saldo = this.Saldo + saldo;
	}
	
	public boolean sacar(float saldo) {
		if(this.Saldo>saldo) {
			this.Saldo = this.Saldo - saldo;
			return true;
			
		}
		else {
			 System.out.println("Saldo insuficiente");
			 return false;
		}
	}
	
}

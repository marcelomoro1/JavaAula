package Exercicio1;

public class ContaCorrente extends Conta{
	
	@Override
	public double depositar() {
		System.out.println("Foi adicionado 100 reais ao saldo de :"+this.saldo);
		return this.saldo = this.saldo + 100;
		
	}

	@Override
	public double sacar() {
		System.out.println("Foi sacado 100 reais ao saldo de :"+this.saldo);
		return this.saldo = this.saldo - 100;
	}

}

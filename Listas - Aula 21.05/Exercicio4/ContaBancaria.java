package Exercicio4;

public class ContaBancaria {
	private double valor;
	
	public double depositar(double qtd) {
		return this.valor = this.valor+qtd;
	}
	
	public double depositar(Cheque cheque) {
		return this.valor = this.valor+cheque.getValor();
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}

package Exercicio5;

public class Produto {
	private double preco;
	
	public double calcularPrecoFinal(double preco) {
		return this.preco = preco;
	}
	
	public double calcularPrecoFinal(Cliente cliente) {
		return preco-cliente.getDesconto();
	}

	public double getPreco() {
		return preco;
	}

	
}

package Exercicio4;

public class Casa {
	public int calcularPreco(int tamanho) {
		return 5500*tamanho;
	}
	
	public int calcularPreco(int tamanho, int quartos) {

		if(quartos>2) {
			return 6500*tamanho;
		}
		else {
			return 5500*tamanho;
		}
	}
	
}

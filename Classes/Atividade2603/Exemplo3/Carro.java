package Exemplo3;

public class Carro {
	String marca;
	String modelo;
	public void configuracoes(String marcaCarro, String modeloCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
}

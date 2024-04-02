package ExemploMotoCarro;

public class Carro {
	String marca;
	String modelo;
	
	public void atribuirCarro(String marcaCarro, String modeloCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public String retornaMarcaCarro(){
		return marca;
	}
	
	public String retornaModeloCarro(){
		return modelo;
	}
}

package Exemplo1;

public class Carro {
	protected String nome; //Apenas visivel pela classe e por quem herda essa classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibirNome() {
		System.out.println("Estou na classe carro\nnome do carro: "+ nome);
	}
	
	
}

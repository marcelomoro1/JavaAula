package Exercicio2;

public class Pessoa {
	protected String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void trabalhar() {
		System.out.println("A pessoa esta trabalhando");
	}
}

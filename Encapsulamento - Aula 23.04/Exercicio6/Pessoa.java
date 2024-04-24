package Exercicio6;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void verificaMaiorIdade(int idade) {
		if(idade>=18) {
			System.out.println("Voce e maior de idade");
		}
		else {
			System.out.println("Voce e menor de idade");
		}
	}
}

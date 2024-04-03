package Exercicio2;
//Criar uma classe chamada Pessoa com 2 construtores, um que receba o nome 
//e a idade da pessoa e outro recebendo apenas a idade. Solicite ao usuário 
//qual dos construtores ele gostaria de utilizar na instanciação da classe. 
//Além de receber parâmetros, os construtores imprimem na tela o conteúdo dos parâmetros recebidos.

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Nome: "+nome+" idade: "+idade);
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
		System.out.println("Idade: "+idade);
	}
	
	
}

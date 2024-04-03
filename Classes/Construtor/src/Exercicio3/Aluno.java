package Exercicio3;

public class Aluno {
	public String nome;
	public int matricula;
	public String datanasc;
	public int ano;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		System.out.println("Nome: "+nome+" matricula: "+matricula);
	}
	
	public Aluno (String datanasc) {
		this.datanasc = datanasc;
		System.out.println("Data nasc: "+datanasc);
	}
	
	public Aluno(String nome, String data, int ano) {
		this.nome = nome;
		this.datanasc = data;
		this.ano = ano;
		System.out.println("Nome: "+nome+" datanasc:"+data+" ano: "+ano);
	}
}

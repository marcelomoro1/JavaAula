package Exercicio1;

public class Disciplina {
	String nome;
	int cargahoraria;
	String nomeProfessor;
	
	public void atribuir(String nomeDisciplina, int carga, String professor) {
		nome = nomeDisciplina;
		cargahoraria = carga;
		nomeProfessor = professor;
	}
	
	public String retornar() {
		return nome+ " "+ cargahoraria + " "+nomeProfessor;
	}
}

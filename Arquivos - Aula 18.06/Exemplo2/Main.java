package Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Criando os objetos aluno
		Aluno a1 = new Aluno("Joao",20);
		Aluno a2 = new Aluno("Maria",21);
		Aluno a3 = new Aluno("Jose",22);
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		//Adiciona os alunos no arquivo
		Arquivo arquivo = new Arquivo("alunos");
		arquivo.gravarArquivo(a1);
		arquivo.gravarArquivo(a2);
		arquivo.gravarArquivo(a3);
		
		listaAlunos = arquivo.leArquivo(); //Armazena a informação do arquivo na lista
		
		for(Aluno a: listaAlunos) {
			System.out.println("Aluno: "+a.getNome()+" idade: "+a.getIdade());
		}
	}

}

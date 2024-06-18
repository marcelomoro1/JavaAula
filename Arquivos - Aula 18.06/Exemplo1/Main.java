package Aula;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João",20);
		Aluno a2 = new Aluno("Maria",21);
		Aluno a3 = new Aluno("Jose",22);
		//ESCREVER ARQUIVO
		try {
			//Criando o arquivo e um escritor para escrever dentro do arquivo
			FileWriter arquivo = new FileWriter("alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			//Escreve uma string para dentro do arquivo
			escritor.write(a1.getNome()+","+a1.getIdade());
			escritor.newLine();
			escritor.write(a2.getNome()+","+a2.getIdade());
			escritor.newLine();
			escritor.write(a3.getNome()+","+a3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no arquivo alunos.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
		//LER ARQUIVO
		try {
			FileReader arquivo = new FileReader("alunos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			String linha;
			while((linha=leitor.readLine()) != null) {
				String[] campos = linha.split(",");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				
				Aluno aluno = new Aluno(nome,idade);
				System.out.println("Aluno: "+aluno.getNome()+", idade: "+aluno.getIdade());
			}
			
			leitor.close();
			arquivo.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
	
	
	}


	
}

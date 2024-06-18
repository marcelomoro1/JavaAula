package Exemplo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Aluno> listAlunos;
	private String nomeArquivo;
	
	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listAlunos = new ArrayList<>();
	}
	
	public void gravarArquivo(Aluno a) {
		//ESCREVENDO NO ARQUIVO
		try {
			//Escrevendo os alunos no arquivo
			arqw = new FileWriter(nomeArquivo+".txt",true);
			escritor = new BufferedWriter(arqw);
			escritor.write(a.getNome()+","+a.getIdade());
			escritor.newLine();
			escritor.close();
			arqw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> leArquivo(){
		//LENDO NO ARQUIVO
		try {
			arqr = new FileReader(nomeArquivo+".txt");
			leitor = new BufferedReader(arqr);
			String linha;
			
			while((linha = leitor.readLine()) != null) {
				String campos[] = linha.split(",");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				
				Aluno aluno = new Aluno(nome,idade);
				listAlunos.add(aluno);
			}
			
			leitor.close();
			arqr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return listAlunos;
	}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;


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
			escritor.write(a.getNome_completo()
                                +","+a.getData_nascimento()
                                +","+a.getSexo()+","
                                +a.getMatricula()+","
                                +a.getCurso()+","
                                +a.getCpf()+","
                                +a.endereco_completo+","
                                +a.getEstado()+","
                                +a.getTelefone());
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
                                String data = campos[1];
                                String sexo = (campos[2]);
                                String matricula = campos[3];
                                String curso = campos[4];
                                String cpf = campos[5];
                                String endereco = campos[6];
                                String estado = campos[7];
                                String telefone = campos[8];
				//int idade = Integer.parseInt(campos[1]);
				
				Aluno aluno = new Aluno(nome,data,sexo,matricula,curso);
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
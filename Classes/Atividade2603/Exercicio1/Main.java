package Exercicio1;
//1) Crie uma classe Disciplina que contenha os atributos (nome, carga horária e nome do professor) e os métodos de atribuir e recuperar esses valores. Mostre na tela:
//a) O conteúdo original dos atributos
//b) A opção para o usuário inserir os valores
//c) A exibição do novo conteúdo dos atributos
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Disciplina disc = new Disciplina();
		Scanner sc = new Scanner(System.in);
		//Conteudo dos atributos originais
		System.out.println(disc.nome+ " "+ disc.cargahoraria + " "+disc.nomeProfessor);
		//Usuario insere os valores
		System.out.println("Digite o nome da disciplina");
		disc.nome = sc.nextLine();
		
		System.out.println("Digite a carga horaria da disciplina");
		disc.cargahoraria = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome do professor");
		disc.nomeProfessor = sc.nextLine();
		//Exibição do novo conteudo dos atributos
		System.out.println(disc.nome+ " "+ disc.cargahoraria + " "+disc.nomeProfessor);
		sc.close();
	}

}

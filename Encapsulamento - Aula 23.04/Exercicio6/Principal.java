package Exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome, cpf e idade da pessoa");
		String nome, cpf;
		int idade;
		nome = sc.nextLine();
		cpf = sc.next();
		idade = sc.nextInt();
		
		p.setCpf(cpf);
		p.setIdade(idade);
		p.setNome(nome);

		System.out.println("Seu nome: "+p.getNome());
		System.out.println("Seu cpf: "+p.getCpf());
		System.out.println("Sua idade: "+p.getIdade());
		p.verificaMaiorIdade(idade);
		sc.close();
	}

}

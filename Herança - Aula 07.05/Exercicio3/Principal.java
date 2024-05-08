package Exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, null, 0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo");
		String tipo = sc.nextLine();
		p1.setTipo(tipo);
		
		System.out.println("Digite o nome");
		String nome = sc.nextLine();
		p1.setNome(nome);
		
		System.out.println("Digite a idade");
		int idade = sc.nextInt();
		p1.setIdade(idade);
		
			
		System.out.println("Nome do negocio: "+ p1.getNome());
		System.out.println("Tipo do negocio: "+ p1.getTipo());
		System.out.println("Idade do negocio: "+ p1.getIdade());
		
		p1.falar();
		p1.andar();
		
		sc.close();
	}

}

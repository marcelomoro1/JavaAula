package Exercicio3;

//Crie uma classe chamada Pessoa. Nesta classe deve conter os atributos: Nome, email, 
//data de nascimento, Endereço e o atributo Admin do tipo booleano. Crie um método que retorne o 
//Email da pessoa. Crie um método chamado promoverAdmin que ao ser chamado altera o atributo Admin. 
//Faça a leitura de duas pessoas na main e mantenha uma como admin e outra não.

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);

		System.out.println("Para pessoa 1: Digite nome, dataNasc, endereco, e se eh admin com true ou false");

		p1.nome = sc.nextLine();
		p1.dataNascimento = sc.nextLine();
		p1.endereco = sc.nextLine();
		p1.admin = true;

		System.out.println("Para pessoa 2: Digite nome, dataNasc, endereco, e se eh admin com true ou false");
		Pessoa p2 = new Pessoa();
		p2.nome = sc.nextLine();
		p2.dataNascimento = sc.nextLine();
		p2.endereco = sc.nextLine();
		p2.admin = false;
		
		System.out.println(p1.nome+" eh admin? "+p1.admin);
		System.out.println(p2.nome+" eh admin? "+p2.admin);
		
		p2.promoverAdmin();
		System.out.println("P2 promovido a admin");
		System.out.println(p2.nome+" eh admin? "+p2.admin);
		
		System.out.println("Digite email da p1:");
		String email1 = p1.email(sc.nextLine());
		
		System.out.println("Digite email da p2:");
		String email2 = (p2.email(sc.nextLine()));
		
		System.out.println("O email da p1 e da p2 eh: "+email1 +" e "+email2);
		
		sc.close();

	}

}

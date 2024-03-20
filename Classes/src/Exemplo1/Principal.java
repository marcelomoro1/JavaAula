package Exemplo1;

import java.util.Scanner;

//As classes são compartilhadas no mesmo pacote
public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(); //New serve para instanciar o p1
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade e nome da pessoa 1");
		p1.idade = teclado.nextInt();
		p1.nome = teclado.next();
		
		System.out.println("Digite a idade e nome da pessoa 2");
		p2.idade = teclado.nextInt();
		p2.nome = teclado.next();

		System.out.println("Digite a idade e nome da pessoa 3");
		p3.idade = teclado.nextInt();
		p3.nome = teclado.next();

		teclado.close();
		
		System.out.println("Idade da pessoa 1: "+p1.idade+ ", idade da pessoa 2: "+ p2.idade + ", idade da pessoa 3: "+p3.idade);
		System.out.println("Nome da pessoa 1: "+p1.nome+ ", nome da pessoa 2: "+ p2.nome + ", nome da pessoa 3: "+p3.nome);
		
	}

}

package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensagem;
		int repetir, op;
		
		System.out.println("Vc quer apenas digitar a mensagem 1 - ou digitar varias vezes ela - 2");
		op = sc.nextInt();
		sc.nextLine();
		Pessoa p;
		
		if (op == 1) {
			System.out.println("Digite a mensagem");
			mensagem = sc.nextLine();
			p = new Pessoa();
			p.falar(mensagem);
			
		}else if(op==2) {
			System.out.println("Digite a mensagem");
			mensagem = sc.nextLine();
			System.out.println("Quantas vezes ela repete?");
			repetir = sc.nextInt();
			p = new Pessoa();
			p.falar(mensagem,repetir);
		}else {
			System.out.println("ta errado mestre");
		}
	
		sc.close();

	}

}

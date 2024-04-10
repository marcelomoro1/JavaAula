package ExercicioRevisao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 se quer criar um produto com nome e preco ou 2 se quer apenas nome");
		int op = sc.nextInt();
		
		if(op==1) {
			System.out.println("Digite o nome do produto");
			String nome = sc.next();
			System.out.println("Digite o preco do produto");
			try {
				double preco = sc.nextDouble();				
				Produto p = new Produto(nome,preco);		
			}catch(Exception e) {
				System.out.println("O erro esta no: "+e.toString());
			}
			
		}else if(op==2) {
			System.out.println("Digite o nome do produto");
			String nome2 = sc.next();
			Produto p2 = new Produto(nome2);
		}
		else {
			System.out.println("Opcao invalida");		
		}
		sc.close();


	}

}

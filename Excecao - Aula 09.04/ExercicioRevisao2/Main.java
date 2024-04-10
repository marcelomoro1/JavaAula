package ExercicioRevisao2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 se quer criar um animal com nome e especie ou 2 se quer apenas nome");
		int op = sc.nextInt();
		
		if(op==1) {
			System.out.println("Digite o nome do animal");
			String nome = sc.next();
			System.out.println("Digite a especie do animal");
			String especie = sc.next();
			Animal a1 = new Animal(nome,especie);		
		}else if(op==2) {
			System.out.println("Digite o nome do animal");
			String nome2 = sc.next();
			Animal a2 = new Animal(nome2);
		}
		else {
			System.out.println("Opcao invalida");		
		}
		sc.close();

	}

}

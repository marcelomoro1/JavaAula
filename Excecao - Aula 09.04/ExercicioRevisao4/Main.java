package ExercicioRevisao4;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 se quer criar um funcionario com nome e salario ou 2 se quer apenas nome");
		int op = sc.nextInt();
		
		if(op==1) {
			try {
				System.out.println("Digite o nome do funcionario");
				String nome = sc.next();
				System.out.println("Digite o salario do funcionario");
				double salario = sc.nextDouble();
				Funcionario f1 = new Funcionario(nome,salario);						
			}catch(Exception e) {
				System.out.println("Nome ou salario invalidos: "+e.toString());
			}
		}else if(op==2) {
			try {
				System.out.println("Digite o nome do funcionario");
				String nome2 = sc.next();
				Funcionario f2 = new Funcionario(nome2);				
			}catch(Exception e) {
				System.out.println("Erro no nome, valor invalido: "+e.toString());
			}
			
		}
		else {
			System.out.println("Opcao invalida");		
		}
		sc.close();

	}

}

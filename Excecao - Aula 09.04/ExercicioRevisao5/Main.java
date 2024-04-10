package ExercicioRevisao5;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 se quer criar um computador com marca,modelo e SO ou 2 se quer apenas marca");
		int op = sc.nextInt();
		
		if(op==1) {
			System.out.println("Digite a marca do pc");
			String marca = sc.next();
			System.out.println("Digite o modelo do pc");
			String modelo = sc.next();
			System.out.println("Digite o SO do pc");
			String so = sc.next();	
			Computador f1 = new Computador(marca,modelo,so);
		}else if(op==2) {
			System.out.println("Digite a marca do pc");
			String nome2 = sc.next();
			Computador f2 = new Computador(nome2);
		}
		else {
			System.out.println("Opcao invalida");		
		}
		sc.close();

	}

}

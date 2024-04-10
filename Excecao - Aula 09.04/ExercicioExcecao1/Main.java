package ExercicioExcecao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		try {
			int n = sc.nextInt();
			System.out.println(Math.sqrt(n));			
		}catch(Exception e) {
			System.out.println("Erro de: "+e.getMessage()+ ", numero errado");

		}
		sc.close();
		

	}

}

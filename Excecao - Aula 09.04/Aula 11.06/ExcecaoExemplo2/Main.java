package ExcecaoExemplo2;

import java.util.Scanner;

public class Main{

	public static void main(String[] args)throws MinhaExcecao {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 numeros");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		divide(n1,n2);

	}
	
	public static void divide(double n1, double n2) throws MinhaExcecao {
		
			if (n2==0) {			
				throw new MinhaExcecao ("Impossivel realizar divisao por 0");
			}
			else {
				System.out.println("O resultado da divisao eh: "+(n1/n2));
			}

	}

}

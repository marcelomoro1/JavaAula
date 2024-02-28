package Exercicio8;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int n1,n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = teclado.nextInt();		
		System.out.println("Digite o segundo numero");
		n2 = teclado.nextInt();		
		teclado.close();
		

		if (n1%n2==0)
			System.out.println(n1+" e"+n2+" sao multiplos");
		else if(n2%n1==0)
			System.out.println(n1+" e"+n2+" sao multiplos");		
		else
			System.out.println(n1+" e"+n2+" nao sao multiplos");
			
		
		

	}
}

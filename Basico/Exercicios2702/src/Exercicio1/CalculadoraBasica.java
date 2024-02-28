package Exercicio1;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		float n1,n2,soma,sub,mult,div;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite numero");
		n1 = teclado.nextFloat();		
		System.out.println("Digite outro numero");
		n2 = teclado.nextFloat();
		
		soma = n1+n2;
		sub = n1-n2;
		mult = n1*n2;
		div = n1/n2;
		
		System.out.println("Soma: "+soma+" Subtracao: "+sub+" Mult: "+mult+" Div: "+div);	
		
		
		teclado.close();
		

	}
}

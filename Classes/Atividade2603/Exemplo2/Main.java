package Exemplo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculadora c = new Calculadora();
		
		System.out.println("Digite o valor de a");
		c.a = teclado.nextDouble();
		
		System.out.println("Digite o valor de b");
		c.b = teclado.nextDouble();		
		teclado.close();
		
		double resultado = c.Somar();
		System.out.println("O valor da soma 1 eh: "+resultado);
		
		Calculadora c2 = new Calculadora();
		c2.a = 11.2;
		c2.b = 12.3;
		double res2;
		res2 = c2.Somar();
		System.out.println("O valor da soma 2 eh: "+res2);		
		
	}

}

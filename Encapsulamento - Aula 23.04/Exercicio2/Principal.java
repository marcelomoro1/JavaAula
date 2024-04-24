package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo c = new Circulo();
		System.out.println("Digite o valor do raio");
		float raio = sc.nextFloat(); 
		c.setRaio(raio);
		float area = c.calculaArea(raio);
		
		System.out.println("O valor do raio digitado eh: "+c.getRaio());
		System.out.println("O Valor da area do circulo eh:"+area);
		sc.close();

	}

}

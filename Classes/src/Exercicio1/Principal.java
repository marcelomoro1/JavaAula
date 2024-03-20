package Exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marca, modelo e ano de fabricacao do carro 1");
		c1.marca = teclado.next();
		c1.modelo = teclado.next();
		c1.anoFabricacao = teclado.nextInt();
		
		System.out.println("Digite a marca, modelo e ano de fabricacao do carro 2");
		c2.marca = teclado.next();
		c2.modelo = teclado.next();
		c2.anoFabricacao = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("Carro 1: "+ c1.marca + " " + c1.modelo + " "+ c1.anoFabricacao);
		System.out.println("Carro 2: "+ c2.marca + " " + c2.modelo + " "+ c2.anoFabricacao);		
	}

}

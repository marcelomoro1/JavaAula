package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Computador pc1 = new Computador();
		Computador pc2 = new Computador();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marca, modelo, tipo e preco do pc 1");
		pc1.marca = teclado.next();
		pc1.modelo = teclado.next();
		pc1.tipo = teclado.nextLine();
		teclado.next();
		pc1.preco = teclado.nextInt();
		
		pc2.marca = "Dell";
		pc2.modelo = "Gamer";
		pc2.tipo = "Notebook";
		pc2.preco = 1959;
		
		System.out.println("PC 1: "+ pc1.marca + " " + pc1.modelo + " "+ pc1.tipo+ " "+ pc1.preco);
		System.out.println("PC 2: "+ pc2.marca + " " + pc2.modelo + " "+ pc2.tipo+ " "+ pc2.preco);
		teclado.close();

	}

}

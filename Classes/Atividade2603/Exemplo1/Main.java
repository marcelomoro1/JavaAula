package Exemplo1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Carro c = new Carro();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marca do carro");
		c.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro");
		c.modelo = teclado.nextLine();
		teclado.close();
		
		c.alugar();
		c.devolver();
	}

}

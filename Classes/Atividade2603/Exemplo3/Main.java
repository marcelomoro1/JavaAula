package Exemplo3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a marca do carro");
		String marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro");
		String modelo = teclado.nextLine();
		c1.configuracoes(marca, modelo);
		teclado.close();
		
		System.out.println("marca: "+c1.retornaMarca());
		System.out.println("modelo: "+c1.retornaModelo() );

		
	}

}

package Exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro c = new Carro();
			
		System.out.println("Digite a marca, o modelo e o ano do carro");
		String marca = sc.nextLine();
		String modelo = sc.nextLine();
		int ano = sc.nextInt();

		c.setAno(ano);
		c.setMarca(marca);
		c.setModelo(modelo);
		
		c.exibeDetalhes();
		
		sc.close();

	}

}

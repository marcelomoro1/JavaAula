package Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite o preco do produto");
		Produto p1 = new Produto();
		Scanner sc = new Scanner(System.in);
		double preco = p1.calcularPrecoFinal(sc.nextDouble());
		System.out.println("Preco final: "+preco);
		
		Cliente c1 = new Cliente();
		c1.setDesconto(30);
		System.out.println("Desconto do cliente");
		System.out.println("Valor final: "+p1.calcularPrecoFinal(c1.getDesconto()));
		sc.close();
	}

}

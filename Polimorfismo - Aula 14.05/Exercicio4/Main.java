package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho,imoveis;
		int op;
		
		System.out.println("Vc quer casa com no max 2 quartos - 1  ou quer mais de 2 quartos - 2?");
		op = sc.nextInt();
		sc.nextLine();
		Casa p;
		
		if (op == 1) {
			System.out.println("Digite o tamanho do imovel em m²");
			tamanho = sc.nextInt();
			p = new Casa();
			int resultado = p.calcularPreco(tamanho);
			System.out.println("O Valor do imovel sera de: "+resultado);
			
		}else if(op==2) {
			System.out.println("Digite o tamanho do imovel em m² e o n de quartos");
			tamanho = sc.nextInt();
			imoveis = sc.nextInt();
			p = new Casa();
			int resultado = p.calcularPreco(tamanho, imoveis);
			System.out.println("O Valor do imovel sera de: "+resultado);
		}else {
			System.out.println("ta errado mestre");
		}
	
		sc.close();

	}

}

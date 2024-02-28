package Exercicio10;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		float n1,n2,soma,sub,mult,div;
		int operacao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite qual op deseja realizar. 1 - soma 2 - sub 3 - mult 4 - div");
		operacao = teclado.nextInt();
		System.out.println("Digite numero");
		n1 = teclado.nextFloat();		
		System.out.println("Digite outro numero");
		n2 = teclado.nextFloat();		
		teclado.close();

		switch(operacao) {
		case 1:
			soma = n1+n2;
			System.out.println("soma eh: "+soma);
			break;
		case 2:
			sub = n1-n2;
			System.out.println("sub eh: "+sub);
			break;
		case 3:
			mult = n1*n2;
			System.out.println("mult eh: "+mult);
			break;
		case 4:
			div = n1/n2;
			System.out.println("div eh: "+div);
			break;	
		default:
			System.out.println("Opcao invalida");
			break;
		}


	}
}

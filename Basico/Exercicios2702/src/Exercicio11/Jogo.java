package Exercicio11;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		int time1,time2,diffora;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o placar do brasil");
		time1 = teclado.nextInt();
		System.out.println("Digite o placar do time de fora");
		time2 = teclado.nextInt();		
		diffora = time2-time1;
		if(diffora>=2)
			System.out.println("Time de fora ja esta classificado");
		else if(diffora<=-2)
			System.out.println("O brasil se classificou");
		else
			System.out.println("Os dois times irao se enfretar novamente em um novo jogo");
			int novo1,novo2,diffinal;
			System.out.println("Digite o placar do brasil no seg jogo");
			novo1 = teclado.nextInt();
			System.out.println("Digite o placar do time de fora no seg jogo");
			novo2 = teclado.nextInt();		
			diffinal = novo2-novo1;
				if(diffinal>=1) {
					System.out.println("O time de fora passou de fase ");
				}
				else if(diffinal<=1) {
					System.out.println("O brasil passou de fase");
				}

				teclado.close();
	}

}

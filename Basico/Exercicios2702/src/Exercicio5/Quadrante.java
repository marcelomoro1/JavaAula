package Exercicio5;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		float p1,p2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ponto x");
		p1 = teclado.nextFloat();	
		System.out.println("Digite o ponto y");
		p2 = teclado.nextFloat();	
		teclado.close();
		
		if((p1>0)&&(p2>0)) {
			System.out.println("Estao no primeiro quadrante");
		}
		else if((p1>0)&&(p2<0)) {
			System.out.println("Estao no quarto quadrante");
		}
		else if((p1<0)&&(p2>0)) {
			System.out.println("Estao no segundo quadrante");
		}
		else if((p1<0)&&(p2<0)) {
			System.out.println("Estao no terceiro quadrante");
		}
		else
			System.out.println("O ponto sobre um dos eixos");
	}
}

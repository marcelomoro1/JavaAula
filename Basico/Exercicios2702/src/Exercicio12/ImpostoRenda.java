package Exercicio12;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {

		float salario,calculo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salario mensal");
		salario = teclado.nextFloat();
		teclado.close();
		
		if(salario<1566.61)
			System.out.println("Voce esta isendo do IR");
		else if((salario>1566.62)&&(salario<2347.85)) {
			calculo = 0.075f*salario;
			System.out.println("Voce paga "+calculo+" de imposto");
			
		}
		else if((salario>2347.86)&&(salario<3130.51)) {
			calculo = 0.15f*salario;
			System.out.println("Voce paga "+calculo+" de imposto");
		}
		else if((salario>3130.52)&&(salario<3911.64)) {
			calculo = 0.225f*salario;
			System.out.println("Voce paga "+calculo+" de imposto");
		}
		else if((salario>3911.64)) {
			calculo = 0.275f*salario;
			System.out.println("Voce paga "+calculo+" de imposto");
		}
	}

}

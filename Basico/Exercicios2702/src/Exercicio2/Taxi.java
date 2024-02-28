package Exercicio2;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		float combst = 4.90f;
		float odometroInicio;
		float odometroFim;	
		float litrosGasto;
		float valorRecebido;
		float mediaConsumo; //km por litro
		float lucroLiq;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marcacao do odometro no começo");
		odometroInicio = teclado.nextFloat();		
		System.out.println("Digite a marcacao do odometro no final");
		odometroFim = teclado.nextFloat();
		System.out.println("Digite o numero de litros gasto de combustivel");
		litrosGasto = teclado.nextFloat();
		System.out.println("Digite o valor total recebido pelos passageiros");
		valorRecebido = teclado.nextFloat();	
		
		mediaConsumo = (odometroFim-odometroInicio)/litrosGasto;
		lucroLiq = valorRecebido - mediaConsumo*combst;
		System.out.println("A media de consumo eh: "+mediaConsumo+"litros e o Lucro liquido eh de: "+lucroLiq+" reais");
		
		
		teclado.close();
		

	}

}

package Exercicio9;

import java.util.Scanner;

public class Eleitor {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade");
		idade = teclado.nextInt();		
		teclado.close();
		

		if (idade<16)
			System.out.println("Pessoa nao esta apta a votar");
		else if((idade>=16)&&(idade<18)||(idade>70))
			System.out.println("Voto facultativo");		
		else
			System.out.println("Voto obrigatorio");
			
		
		

	}

}

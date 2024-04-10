package ExercicioExcecao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma string em formato de numero");
		try {
			String valor = teclado.nextLine();
			double numero = Double.parseDouble(valor);
			System.out.println("O numero digitado em double eh: "+numero);
		}catch(Exception e) {
			System.out.println("Erro: "+e.getMessage()+", digite um numero valido");
		}
		teclado.close();

	}

}

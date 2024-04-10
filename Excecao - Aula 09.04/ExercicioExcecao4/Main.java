package ExercicioExcecao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//NumberFormatException: Esta exceção é lançada quando ocorre um erro durante a conversão de uma string em um formato numérico
		//ArithmeticException: Essa exceção é lançada quando ocorre um erro aritmético durante a execução de uma operação matemática, como divisão por zero. 
		//NullPointerException: Esta exceção é lançada quando você tenta acessar ou modificar um objeto que possui o valor null.
		//IndexOutOfBoundsException: Esta exceção é lançada quando você tenta acessar um índice inválido em uma estrutura de dados, como uma matriz (array) ou uma lista.
		//FileNotFoundException: Esta exceção é lançada quando um arquivo especificado não pode ser encontrado ou aberto durante a operação de leitura ou gravação de arquivo.
		//IOException: Esta exceção é lançada quando ocorre um erro durante a operação de entrada e saída (I/O). 
		//ClassNotFoundException: Esta exceção é lançada quando uma classe não pode ser encontrada durante a operação de carregamento dinâmico de classes
		//IllegalArgumentException: Esta exceção é lançada quando um argumento passado para um método é inválido.
		
		//Vamos testar IndexOutOfBOundsException e ArithmeticException
		
		Scanner teclado = new Scanner(System.in);
		int[] lista = {1,23,4,5};
		try {
			System.out.println(lista[4]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		int valor1, valor2;
		valor1 = 10;
		valor2 = 0;
		try {
			System.out.println(valor1/valor2);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		teclado.close();
	}

}

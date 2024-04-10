package ExercicioExcecao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Para realizar a soma digite um valor para A e B");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c1.soma(a,b));
		}catch(Exception e) {
			System.out.println("Deu erro na soma: "+e.getMessage());
		}
		
		try {
			System.out.println("Para realizar a subtracao digite um valor para A e B");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c1.sub(a,b));		
		}catch(Exception e) {
			System.out.println("Deu erro na subtracao: "+e.getMessage());
		}
		
		try {
			System.out.println("Para realizar a divisao digite um valor para A e B");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c1.div(a,b));		
		}catch(Exception e) {
			System.out.println("Deu erro na divisao: "+e.getMessage());
		}
		
		try {
			System.out.println("Para realizar a multiplicacao digite um valor para A e B");
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			System.out.println(c1.mult(a,b));		
		}catch(Exception e) {
			System.out.println("Deu erro na multiplicacao: "+e.getMessage());
		}
		teclado.close();
	}

}

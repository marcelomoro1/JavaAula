package ExercicioRevisao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	       System.out.println("Deseja criar um triângulo com os três lados (1) ou apenas com um lado (2)?");
	       int opcao = scanner.nextInt();
	       scanner.nextLine(); // Limpa o buffer do scanner

	        if (opcao == 1) {
	        	try {
	        		System.out.println("Digite o valor do primeiro lado do triângulo:");
	        		double lado1 = scanner.nextDouble();
	        		System.out.println("Digite o valor do segundo lado do triângulo:");
	        		double lado2 = scanner.nextDouble();
	        		System.out.println("Digite o valor do terceiro lado do triângulo:");
	        		double lado3 = scanner.nextDouble();
	        		Triangulo t1 = new Triangulo(lado1, lado2, lado3);
	        		System.out.println("O triângulo é " + t1.tipoDeTriangulo(lado1, lado2, lado3));	        		
	        	}catch(Exception e) {
	        		System.out.println("Um dos lados foi digitado com valor invalido: "+e.toString());
	        	}
	            
	        } else if (opcao == 2) {
	        	try {
	        		System.out.println("Digite o valor do lado do triângulo equilátero:");
	        		double lado = scanner.nextDouble();
	        		Triangulo t2 = new Triangulo(lado);
	        		System.out.println("O triângulo é " + t2.tipoDeTriangulo(lado, lado, lado));        		
	        	}catch(Exception e) {
	        		System.out.println("O lado esta invalido: "+e.toString());
	        	}
	            
	        } else {
	            System.out.println("Opção inválida. Encerrando o programa.");
	        }

	        scanner.close();
	    }
		
	}



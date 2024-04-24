package encapsulamentoExemplo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		a1.setNome("sa");
		
		System.out.println("Digite a nota 1 do aluno");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2 do aluno");
		double nota2 = sc.nextDouble();
		
		a1.setNota1(nota1);
		a1.setNota1(nota2);
		
		double media = a1.calculaMedia(nota1, nota2);
		System.out.println("Aluno: "+a1.getNome()+ ", media: "+media);
		sc.close();
	}

}

package Exemplo2;

import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
		Professor p1 = new Professor();
		Laboratorio lab = new Laboratorio();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do professor e a sala do laboratorio");
		p1.nome = teclado.nextLine();
		lab.local = teclado.nextLine();
		teclado.close();
		
		System.out.println("Nome do professor: "+p1.nome+", sala do laboratorio: "+lab.local);
		
	}

}

package Exemplo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja criar uma pessoa ou um programador? 1 ou 2");
		int op;
		op = sc.nextInt();
		Pessoa p;
		if(op==1) {
			p = new Pessoa();
			p.trabalhar();
		}
		else if(op==2) {
			p = new Programador();
			p.trabalhar();
		}
		sc.close();
		

	}

}

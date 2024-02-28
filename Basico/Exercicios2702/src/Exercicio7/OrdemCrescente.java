package Exercicio7;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = teclado.nextInt();	
		System.out.println("Digite o segundo numero");
		n2 = teclado.nextInt();	
		System.out.println("Digite o terceiro numero");
		n3 = teclado.nextInt();			
		teclado.close();
		
		if ((n1>n2)&&(n1>n3)) {
			System.out.println(n1+" eh o maior");
			if(n2>n3) {
				System.out.println("Ordem eh: "+n3+" "+n2+" "+n1);		
			}
			else if(n3>n2) {
				System.out.println("Ordem eh: "+n2+" "+n3+" "+n1);				
			}
		}
		else if ((n2>n1)&&(n2>n3)) {
			System.out.println(n2+" eh o maior");				
			if(n3>n1) {
				System.out.println("Ordem eh: "+n1+" "+n3+" "+n2);				
			}
			else if(n1>n3) {
				System.out.println("Ordem eh: "+n3+" "+n1+" "+n2);							
			}
		}
		else {
			System.out.println(n3+" eh o maior");
			if(n2>n1) {
				System.out.println("Ordem eh: "+n1+" "+n2+" "+n3);			
			}
			else if (n1>n2) {	
				System.out.println("Ordem eh: "+n2+" "+n1+" "+n3);		
			}
		}
		
	}
}

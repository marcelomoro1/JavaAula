package Exercicio4;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		n1 = teclado.nextInt();		
		System.out.println("Digite o segundo numero");
		n2 = teclado.nextInt();		
		System.out.println("Digite o terceiro numero");
		n3 = teclado.nextInt();		
		System.out.println("Digite o quarto numero");
		n4 = teclado.nextInt();		

		media = (n1+n2+n3+n4)/4;
		if(n1>media)
			System.out.println(n1+" eh maior que a media: "+media);
		if(n2>media)
			System.out.println(n2+" eh maior que a media: "+media);
		if(n3>media)
			System.out.println(n3+" eh maior que a media: "+media);
		if(n4>media)
			System.out.println(n4+" eh maior que a media: "+media);		
		
		teclado.close();
		

	}

}

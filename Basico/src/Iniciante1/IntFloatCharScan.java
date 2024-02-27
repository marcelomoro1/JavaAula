package Iniciante1;
import java.util.Scanner;
public class IntFloatCharScan {

	public static void main(String[] args) {
		String texto;
		int ano;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um nome completo");
		texto = teclado.nextLine();
		System.out.println("Digite o seu ano de nascimento");
		ano = teclado.nextInt();
		System.out.println("Digite o primeiro valor");
		float valor1 = teclado.nextFloat();
		System.out.println("Digite o segundo valor");
		float valor2 = teclado.nextFloat();
		System.out.println("Digite um caracter");
		char c = teclado.next().charAt(0);
		
		teclado.close();
		
		int idade = 2024-ano;
		float calculo = valor1/valor2;
		
		if (idade>=18)
			System.out.println("Voce eh maior de idade");
		else
			System.out.println("Voce eh menor de idade");
		
		System.out.printf("Seu nome eh: %s e sua idade eh: %d\n",texto, idade);
		System.out.println("A divisao do primeiro valor pelo segundo eh de: "+ calculo);
		System.out.println("O caracter que voce digitou eh: "+c);

	}

}

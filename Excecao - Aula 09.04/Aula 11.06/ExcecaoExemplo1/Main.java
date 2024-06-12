package ExcecaoExemplo1;

public class Main {

	public static void main(String[] args) {
//EXEMPLO 1		
//		int[] numeros = {1,2,3};
//		System.out.println(numeros[4]); //ArrayIndexOutOfBonds

//EXEMPLO 2
//		int a = 10;
//		int b = 0;
//		System.out.println(a/b);		//ArithmeticException
		
//EXEMPLO 3
//		String numero = "abc";
//		int valor = Integer.parseInt(numero); //NumberFormatException

//EXEMPLO 4
		try {
			String numero = "abc";
			int valor = Integer.parseInt(numero); //NumberFormatException		
		} catch(NumberFormatException e) {
			System.out.println("Erro: formato do numero invalido");
		} catch(Exception e) {
			System.out.println("Erro: "+ e.toString());
		}
		
		
	}

}

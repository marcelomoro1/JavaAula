package Exemplo2;

public class TratarExcecoes {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Erro 1 : "+e.getMessage());
		}
		
		String numero = "abc";
		try {
			int valor = Integer.parseInt(numero);
			System.out.println(valor);
		}
		catch(Exception e) {
			System.out.println("Erro 2: "+e.getMessage());
		}
	}

}

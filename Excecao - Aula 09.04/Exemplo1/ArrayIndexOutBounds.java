package Exemplo1;

public class ArrayIndexOutBounds {

	public static void main(String[] args) {
		int[] numeros = {1,2,3};
		try {
			System.out.println(numeros[3]);
		}catch(Exception e) {
			System.out.println("Deu um erro ai de: "+ e.getMessage());
		}

	}

}

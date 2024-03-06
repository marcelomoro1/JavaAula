package Exercicios;
//Escreva um programa Java que use um laço para imprimir os números primos de 1 a 50.
public class Exercicio9 {

	public static void main(String[] args) {
		
        for(int i = 2; i <= 50; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }

	}

}

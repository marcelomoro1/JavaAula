package Exercicio3;

public class Pessoa {
	public void falar(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void falar(String mensagem, int x) {
		for(int i=0; i<x;i++) {
			System.out.println(mensagem);			
		}
	}
}

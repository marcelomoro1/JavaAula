package Exercicio11;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static int retornaMulheres(List<Pessoa> lista){
		int contador=0;
		for(Pessoa i: lista) {
			if(i.getSexo()=='M') {
				contador++;
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa("Brabo",25,'H');
		Pessoa p2 = new Pessoa("Mito",90,'M');
		Pessoa p3 = new Pessoa("Guerreiro",30,'M');
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		System.out.println("A quantidade de mulheres eh: "+retornaMulheres(lista));

	}


}

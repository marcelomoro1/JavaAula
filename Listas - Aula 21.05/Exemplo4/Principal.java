package Exemplo4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void exibirPessoas(List<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println("Nome: "+p.getNome());
			System.out.println("Idade: "+p.getIdade());
		}
	}
	
	public static void main(String[] args) {
		List<Pessoa> Lista = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Joao",30);
		Pessoa p2 = new Pessoa("KleitonRasta",24);
		Pessoa p3 = new Pessoa("DASD",30);
		
		Lista.add(p1);
		Lista.add(p2);
		Lista.add(p3);
		
		exibirPessoas(Lista);
	}

}

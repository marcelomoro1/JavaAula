package Exercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void ordemDeLancamento(List<Livro>lista) {
		Collections.sort(lista, (livro1,livro2)->livro1.getAno() - livro2.getAno());
		for(Livro i: lista) {
			System.out.println("Titulo: "+i.getTitulo()+" Autor: "+i.getAutor()+ "Ano: "+i.getAno());
		}
	}
	
	public static void main(String[] args) {
		List<Livro> lista = new ArrayList<Livro>();
		Livro p1 = new Livro("Brabo","Ueba",2020);
		Livro p2 = new Livro("Mito","fsdfds",2004);
		Livro p3 = new Livro("Guerreiro","CarlosMaia",2008);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		ordemDeLancamento(lista);
		
	}

}

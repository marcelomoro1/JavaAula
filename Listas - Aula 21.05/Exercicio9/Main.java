package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();
		Produto p1 = new Produto ("CanetaAzul",15.15,4);
		Produto p2 = new Produto ("CanetaVerde",12.12,5);		
		Produto p3 = new Produto ("CanetaAmarela",11.11,6);	
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		for(Produto i:lista) {
			System.out.println("Produto:"+" "+i.getNome()+", preco: "+i.getPreco()+", qtd: "+i.getQtd());
		}
	}

}

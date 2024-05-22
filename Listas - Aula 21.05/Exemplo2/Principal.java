package Exemplo2;



public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto("Caneta",1.5);
		Produto p2 = p1.clone();
		
		System.out.println("Prod 1| nome: "+p1.getNome()+" preco: "+p1.getPreco());
		System.out.println("Prod 2| nome: "+p2.getNome()+" preco: "+p2.getPreco());
		
		p2.setPreco(2.0);
		
		System.out.println("Prod 1| nome: "+p1.getNome()+" preco: "+p1.getPreco());
		System.out.println("Prod 2| nome: "+p2.getNome()+" preco: "+p2.getPreco());	
	}

}

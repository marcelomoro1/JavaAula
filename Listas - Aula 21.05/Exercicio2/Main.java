package Exercicio2;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new ProdutoComDesconto();
		System.out.println(p1.desconto());
		System.out.println(p2.desconto());
	}

}

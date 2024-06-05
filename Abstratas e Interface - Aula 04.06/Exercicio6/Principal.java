package Exercicio6;

public class Principal {

	public static void main(String[] args) {
		Livro l = new Livro("AAAA",15.0,"Muito brabo");
		CD c = new CD("BBBB",23.0,"Muito ruim");	

		l.getNome();
		l.getPreco();
		l.getDescricao();
		
		c.getNome();
		c.getPreco();
		c.getDescricao();
	
	}

}

package Exercicio4;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.anoPublicacao = 2020;
		livro.autor = "Roger";
		livro.titulo = "AAAA";
		
		System.out.println("Autor: "+livro.autor+", titulo: "+livro.titulo+", ano de publicacao: "+livro.anoPublicacao);

	}

}

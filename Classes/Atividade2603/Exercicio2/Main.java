package Exercicio2;


//Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e
//Emprestado (bool). Crie método que retorne as informações do livro. Crie também um método 
//responsável por fazer o empréstimo do livro e outro para fazer a devolução. Faça o controle disto 
//utilizando o atributo Emprestado.
public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro();

		System.out.println("titulo: " +livro.titulo+ " autor: "+livro.autor+" ano: "+livro.ano+" genero: "+livro.genero+" emprestado? "+livro.emprestado);

		System.out.println("Voce pega o livro emprestado");
		livro.emprestimo();
		System.out.println("Livro esta emprestado? "+livro.emprestado);
		
		System.out.println("Voce devolve o livro");
		livro.devolucao();
		System.out.println("Livro esta emprestado? "+livro.emprestado);
		

	}

}

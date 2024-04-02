package Exercicio2;

public class Livro {
	String titulo = "Marcelinho pao e vinho";
	String autor = "Zamberlanis";
	int ano = 2023;
	String genero = "Drama";
	Boolean emprestado = false;
	
	public String retornar() {
		return "titulo: " +titulo+ " autor: "+autor+" ano: "+ano+" genero: "+genero+" emprestado? "+emprestado; 
	}
	
	public Boolean emprestimo() {
		return emprestado = true;
	}
	
	public Boolean devolucao() {
		return emprestado = false;
	}


}

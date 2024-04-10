package ExercicioRevisao1;

public class Produto {
	String nome;
	double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
	}
	
	public Produto(String nome) {
		this.nome = nome;
        System.out.println("Nome do produto: " + this.nome);
	}

	
}

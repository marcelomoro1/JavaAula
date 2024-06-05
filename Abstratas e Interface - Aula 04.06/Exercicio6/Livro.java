package Exercicio6;

public class Livro implements Produto {
	String nome;
	Double preco;
	String descricao;
	
	public Livro(String nome, Double preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	@Override
	public void getNome() {
		System.out.println("O nome eh: "+this.nome);

	}

	@Override
	public void getPreco() {
		System.out.println("O preco eh: "+this.preco);

	}

	@Override
	public void getDescricao() {
		System.out.println("A descricao eh: "+this.descricao);

	}

}

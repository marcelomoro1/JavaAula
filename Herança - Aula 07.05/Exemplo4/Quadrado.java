package Exemplo4;

public class Quadrado extends Desenho2D {
	protected String desc;

	public Quadrado(String nome,int largura, int altura, String desc) {
		super(largura, altura, nome);
		this.desc = desc;
	}
	
	public void ExibeDados() {
		System.out.println("Largura: "+this.largura);
		System.out.println("Altura: "+this.altura );
		System.out.println("Desc: "+this.desc );
		System.out.println("Autor: "+this.nomeAutor );
	}
}

package Exercicio1;

public class Notebook extends Computador{
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String exibeMarca() {
		return "marca: "+this.marca;
	}
	
	public static void main(String[] args) {
		Notebook not = new Notebook();
		not.setMarca("aaaaaa");
		System.out.println(not.exibeModelo());
		System.out.println(not.exibeMarca());
		
		
	}

}

package Exercicio1;

public class Netbook extends Computador{
	
	public String exibeMarca() {
		return "marca: "+this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public static void main(String[] args) {
		Netbook n1 = new Netbook();
		n1.setMarca("opa");
		System.out.println(n1.exibeModelo());
		System.out.println(n1.exibeMarca());
		

	}

}

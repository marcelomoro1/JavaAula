package Exemplo1;

public class Principal {

	public static void main(String[] args) {
		Onibus o = new Onibus();
		o.setNome("Brabo"); //Esse metodo esta na classe Carro
		o.setModelo("zika");
		
		o.exibirNome();
		System.out.println("O nome do onibus: "+o.getNome());
		System.out.println("O modelo do onibus: "+ o.getModelo());
	}

}

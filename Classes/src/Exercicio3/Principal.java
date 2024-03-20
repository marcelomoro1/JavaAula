package Exercicio3;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.genero = "Masculino";
		p1.idade = 25;
		p1.nome = "Wagner";
		
		System.out.println("Nome: "+p1.nome+", idade: "+p1.idade+", genero: "+p1.genero);
	}

}

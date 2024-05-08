package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(null);
		f1.setNome("Marcelo");
		System.out.println("O nome do funcionario: "+f1.getNome());
		f1.trabalhar();

	}

}

package Exercicio3;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		f1.calcularSalario();

		Funcionario g1 = new Gerente();
		g1.setSalario(1000);
		g1.calcularSalario();
	}

}

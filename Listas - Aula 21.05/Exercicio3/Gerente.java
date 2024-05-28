package Exercicio3;

public class Gerente extends Funcionario{

	public Gerente() {
		super();
	}
	
	public void calcularSalario() {
		System.out.println("Salario: "+(getSalario() +1000));
	}
}

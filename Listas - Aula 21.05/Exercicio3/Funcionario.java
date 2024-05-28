package Exercicio3;

public class Funcionario {
	private float salario;
	
	
	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public void calcularSalario() {
		System.out.println("Salario: "+(salario+500));
	}
}

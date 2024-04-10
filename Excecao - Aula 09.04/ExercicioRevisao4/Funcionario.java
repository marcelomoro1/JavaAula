package ExercicioRevisao4;

public class Funcionario {
	String nome;
	double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("salario do funcionario: " + this.salario);
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
        System.out.println("Nome do funcionario: " + this.nome);
	}
}

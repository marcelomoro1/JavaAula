package Exercicio6;

public class Funcionario {
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentarSalario() {
		return this.salario+=400;
	}
	
	public double aumentarSalario(Gerente gerente) {
		return this.salario+=gerente.getSalario()+400+gerente.getBonusAnual();
	}
	
	
}

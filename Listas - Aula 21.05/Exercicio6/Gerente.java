package Exercicio6;

public class Gerente extends Funcionario{
	private double BonusAnual;

	public double getBonusAnual() {
		return BonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		BonusAnual = bonusAnual;
	}

	@Override
	public String toString() {
		return "Nome = " + getNome() + ", Salario = " + getSalario() + getBonusAnual()+ "]";
	}
	
}

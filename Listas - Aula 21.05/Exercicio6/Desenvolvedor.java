package Exercicio6;

public class Desenvolvedor extends Funcionario {
	private int horasExtras;

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	@Override
	public String toString() {
		return "Nome = " + getNome() + ", Salario = " + getSalario() +", Horas extras = "+ getHorasExtras()+ "]";
	}
}

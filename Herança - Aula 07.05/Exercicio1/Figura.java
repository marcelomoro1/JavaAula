package Exercicio1;

public class Figura {
	protected String cor;
	protected boolean preenchido;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isPreenchido() {
		return preenchido;
	}
	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}
	
	public Figura(String cor, boolean preenchido) {
		super();
		this.cor = cor;
		this.preenchido = preenchido;
	}
	
	
}

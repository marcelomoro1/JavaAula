package Exercicio3;

public class Animal {
	protected String tipo;

	public Animal(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void andar() {
		System.out.println("Todos andam, mas o modo é variado");
	}
	
}

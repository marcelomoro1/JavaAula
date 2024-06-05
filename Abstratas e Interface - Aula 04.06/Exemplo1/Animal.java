package Exemplo1;

public abstract class Animal {
	protected String especie;
	protected int idade;
	public abstract void emiteSom();
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void mostra() {
		System.out.println("[especie=" + especie + ", idade=" + idade + "]");
	}

	

	
	
	
	
	
}

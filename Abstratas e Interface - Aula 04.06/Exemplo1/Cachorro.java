package Exemplo1;

public class Cachorro extends Animal{
	public String raca;
	@Override
	public void emiteSom() {
		System.out.println("AU AUA");
		
	}
	
	public void cuidarPatio() {
		System.out.println("Cachorro esta cuidando do patio");
	}

	public void mostra() {
		System.out.println("[especie=" + especie + ", idade=" + idade + ", raca = " + raca+"]");
	}
}

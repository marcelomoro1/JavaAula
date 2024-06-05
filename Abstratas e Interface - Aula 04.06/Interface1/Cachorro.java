package Interface1;

public class Cachorro implements Animal {
	String nome;
	int idade;
	@Override
	public void emiteSom() {
		System.out.println("auauau");

	}

	@Override
	public void exibeDados() {
		System.out.println("Nome: "+nome+", idade: "+idade);

	}
	
	public void cuidarPatio() {
		System.out.println("O cachorro cuida do patio");
	}

}

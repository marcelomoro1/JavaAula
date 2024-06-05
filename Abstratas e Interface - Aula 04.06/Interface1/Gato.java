package Interface1;

public class Gato implements Animal {
	String nome;
	int idade;
	@Override
	public void emiteSom() {
		System.out.println("Miau");

	}

	@Override
	public void exibeDados() {
		System.out.println("Nome: "+nome+", idade: "+idade);

	}

}

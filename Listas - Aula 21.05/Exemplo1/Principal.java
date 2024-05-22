package Exemplo1;

public class Principal {

	public static void meuMetodo(Pessoa p) {
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
	}
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Welington", 18);
		meuMetodo(p);

	}

}

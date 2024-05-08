package Exemplo2;

public class Principal {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		cao.setIdade(10);
		cao.setNome("Cleiton");
		cao.setRaca("Viralata");
		cao.setSom("auauuauauasu");
		
		System.out.println(cao.getNome());
		System.out.println(cao.getIdade());
		System.out.println(cao.getRaca());
		
		cao.latir();
	}

}

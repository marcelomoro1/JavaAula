package Exemplo3;

public class Principal {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua 1",123);
		Pessoa p = new Pessoa("Joao", 30, endereco);
		
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		System.out.println("Endereco: "+p.getEndereco().getNumero()+" "+p.getEndereco().getRua() );
	}

}

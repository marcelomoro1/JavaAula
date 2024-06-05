package Exercicio7;

public class BancoDeDados implements AcessoDados {

	@Override
	public void conectar() {
		System.out.println("Se conectou ao banco");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectou do banco");

	}

	@Override
	public void inserir() {
		System.out.println("Se inseriu no banco");

	}

	@Override
	public void atualizar() {
		System.out.println("Atualizou o banco");

	}

	@Override
	public void excluir() {
		System.out.println("Excluiu o banco");

	}

}

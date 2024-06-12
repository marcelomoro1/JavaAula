package ExcecaoExemplo2;

public class MinhaExcecao extends Exception{
	public MinhaExcecao() {
		super();
	}
	
	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}
	
}

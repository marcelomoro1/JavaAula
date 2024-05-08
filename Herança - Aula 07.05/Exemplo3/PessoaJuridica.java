package Exemplo3;

public class PessoaJuridica extends Pessoa {
	
	protected String CNPJ;
	protected String socio;
	protected String dataAbertura;
	
	public PessoaJuridica(String nome, int idade, String cNPJ, String socio, String dataAbertura) {
		super(nome, idade);
		CNPJ = cNPJ;
		this.socio = socio;
		this.dataAbertura = dataAbertura;
	}
	

	
}

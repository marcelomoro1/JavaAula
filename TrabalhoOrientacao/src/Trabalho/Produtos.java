package Trabalho;

public class Produtos {
	private String codigo;
	private String descricao;
	private Float pcusto;
	private Float pvenda;
	private int estoque;
	
	public Produtos(String codigo, String descricao, Float pcusto, Float pvenda, int estoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.pcusto = pcusto;
		this.pvenda = pvenda;
		this.estoque = estoque;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getPcusto() {
		return pcusto;
	}
	public void setPcusto(Float pcusto) {
		this.pcusto = pcusto;
	}
	public Float getPvenda() {
		return pvenda;
	}
	public void setPvenda(Float pvenda) {
		this.pvenda = pvenda;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
}

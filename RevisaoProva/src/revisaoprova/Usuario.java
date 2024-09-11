/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoprova;

/**
 *
 * @author marce
 */
public abstract class Usuario {
    protected String nomeCompleto;
    protected String dataNascimento;
    protected String sexo;
    protected String rg;
    protected String enderecoCompleto;
    protected String estado;
    protected String telefone;
    protected String nomePai;
    protected String nomeMae;
    protected String nacionalidade;

    public Usuario(String nomeCompleto, String dataNascimento, String sexo, String rg, String enderecoCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rg = rg;
        this.enderecoCompleto = enderecoCompleto;
    }

    public abstract String executaAcao();
            
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
}

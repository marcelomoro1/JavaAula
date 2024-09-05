/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author laboratorio
 */
public class Aluno {
       protected String nome_completo;
       protected String data_nascimento;
       protected String sexo;
       protected String matricula;
       protected String curso;
       protected String cpf;
       protected String endereco_completo;
       protected String estado;
       protected String telefone;

    public Aluno(String nome_completo, String data_nascimento, String sexo, String matricula, String curso) {
        this.nome_completo = nome_completo;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.endereco_completo = endereco_completo;
        this.estado = estado;
        this.telefone = telefone;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome_completo=" + nome_completo + ", data_nascimento=" + data_nascimento + ", sexo=" + sexo + ", matricula=" + matricula + ", curso=" + curso + ", cpf=" + cpf + ", endereco_completo=" + endereco_completo + ", estado=" + estado + ", telefone=" + telefone + '}';
    }
       
    public Object[] obterDados(){
        return new Object[] {nome_completo,data_nascimento,sexo,matricula,curso};
    }   
       
}

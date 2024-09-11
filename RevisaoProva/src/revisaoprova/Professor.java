/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoprova;

/**
 *
 * @author marce
 */
public class Professor extends Usuario {
    protected String matricula;
    protected String area_formacao;
    protected String curso;

    public Professor(String matricula, String nomeCompleto, String dataNascimento, String sexo, String rg, String enderecoCompleto) {
        super(nomeCompleto, dataNascimento, sexo, rg, enderecoCompleto);
        this.matricula = matricula;
    }

    @Override
    public String executaAcao() {
        return "Os dados do professor foram inseridos";
    }

    public String getMatricula() {
        return matricula;
    }

    public String getArea_formacao() {
        return area_formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setArea_formacao(String area_formacao) {
        this.area_formacao = area_formacao;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Object[] obterDados(){
        return new Object[] {matricula,nomeCompleto,dataNascimento,sexo,rg,enderecoCompleto};
    }   
    
}

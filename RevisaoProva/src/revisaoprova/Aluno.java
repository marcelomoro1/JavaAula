/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoprova;

/**
 *
 * @author marce
 */
public class Aluno extends Usuario{

    protected String matricula;
    protected String curso;

    public Aluno(String matricula, String nomeCompleto, String dataNascimento, String sexo, String rg, String enderecoCompleto) {
        super(nomeCompleto, dataNascimento, sexo, rg, enderecoCompleto);
        this.matricula = matricula;
    }
    
    

    @Override
    public String executaAcao() {
       return "Os dados do aluno foram inseridos";
    }
    
    public Object[] obterDados(){
        return new Object[] {matricula,nomeCompleto,dataNascimento,sexo,rg,enderecoCompleto};
    } 
}

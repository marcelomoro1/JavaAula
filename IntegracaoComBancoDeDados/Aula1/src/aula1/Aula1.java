/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

import beans.Pessoa;
import conexao.Conexao;
import dao.PessoaDAO;

/**
 *
 * @author laboratorio
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
        
        Pessoa p1 = new Pessoa();
        p1.setNome("sdas");
        p1.setSexo("M");
        p1.setIdioma("Portugues");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p1);
           
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import DAO.PessoaDAO;
import beans.Pessoa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author laboratorio
 */
public class ThreadServer extends Thread {
    private Socket clienteSocket;

    public ThreadServer(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {
        try{
            ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream()); //instanciando a resposta pro cliente
            ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());
            
            int id = in.readInt();
            System.out.println("ID recebido: "+id);
            
            PessoaDAO pDAO = new PessoaDAO(); //Simula a obtenção de uma pessoa pelo id recebido do in
            Pessoa p = pDAO.getPessoa(id);
            out.writeObject(p); //Retorna pro cliente o objeto pessoa pelo id
            
            
        }catch(IOException ex){
            System.out.println("Erro ao aceitar conexao do cliente"+ ex.getMessage());
        }
    }
    
    
}

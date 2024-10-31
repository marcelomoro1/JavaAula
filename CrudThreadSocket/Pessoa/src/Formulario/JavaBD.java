/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formulario;

import DAO.PessoaDAO;
import Threads.ThreadServer;
import beans.Pessoa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author laboratorio
 */
public class JavaBD {
    public static void main(String[] args) {
        int porta = 12345;
        
        try(ServerSocket servidorSocket = new ServerSocket(porta)){
            System.out.println("Servidor aguardando conexões na porta: "+porta);
            
            while(true){
                try{
                    Socket clienteSocket = servidorSocket.accept(); //aceitou a requisição do cliente
                    System.out.println("Conexao aceita de: "+ clienteSocket.getInetAddress()); //mostra o ip do cliente
                    
                    //ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream()); //instanciando a resposta pro cliente
                    //ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream()); //instanciando o recebimento da informação do cliente
                    
                    //int id = in.readInt(); //pega o id do pedido do cliente
                    //System.out.println("ID recebido: "+id);
                    
                    //PessoaDAO pDAO = new PessoaDAO(); //Simula a obtenção de uma pessoa pelo id recebido do in
                    //Pessoa p = pDAO.getPessoa(id);
                    //out.writeObject(p); //Retorna pro cliente o objeto pessoa pelo id
                    
                    Thread threadCliente = new ThreadServer(clienteSocket);
                    threadCliente.start();
                    
                }catch(IOException ex){
                    System.out.println("Erro ao aceitar conexao do cliente"+ ex.getMessage());
                }
            }
            
        }catch(IOException ex){
            System.out.println("Erro ao criar o server Socket"+ ex.getMessage());
        }
    }
}

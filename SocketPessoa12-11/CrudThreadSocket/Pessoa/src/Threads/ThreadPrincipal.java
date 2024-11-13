/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author laboratorio
 */
public class ThreadPrincipal {
    public static void main(String[] args) {
        //Criando as threads secundarias
        MinhaThread t1 = new MinhaThread("MENSAGEM DA THREAD 1 EM 1 SEGUNDO",1000);
        MinhaThread t2 = new MinhaThread("MENSAGEM DA THREAD 2 EM 2 SEGUNDO",2000);
        
        t1.start();
        t2.start();
        
        //Executando as operações na thread principal
        for(int i =0; i<5;i++){
            System.out.println("Thread principal - Iteração "+i);
            try{
                Thread.sleep(1500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

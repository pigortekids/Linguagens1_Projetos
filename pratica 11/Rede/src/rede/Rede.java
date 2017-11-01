package rede;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rede {

    public static void main(String[] args) {
        
        String msg = " ";
        try {
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("calmo bebe");
            while(true){
                
                Socket cliente = servidor.accept();
                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                out.println("Olá, Bem vindo");
                
                //System.out.println("cliente conectado: " + cliente.getInetAddress().getHostAddress());
                //ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                //saida.flush();
                //saida.writeObject(new Date());
                //saida.close();
                while(msg != "sair"){
                    Scanner in = new Scanner(cliente.getInputStream());// pega do putty
                    msg = in.nextLine();
                    System.out.println(msg);

                    Scanner scan = new Scanner(System.in); // pega desse programa
                    msg = scan.nextLine();
                    out.println(msg);
                }
                
                //cliente.close();
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Rede.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

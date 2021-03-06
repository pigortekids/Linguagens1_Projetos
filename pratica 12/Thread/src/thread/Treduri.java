package thread;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treduri implements Runnable{

    static Socket cliente;
    static boolean fechou = false;
    
    public static void main(String[] args){
        
        try {
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("calmo bebe");
            
            cliente = servidor.accept();
            System.out.println("Nova conexão");
         
            Thread thr_entrada = new Thread(new Treduri());
            thr_entrada.start();

            try(
                Scanner teclado = new Scanner(System.in);
                PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
            )
            {
                saidaRede.println("Boa garotão");
                
                String msg = " ";
                while(!fechou && !msg.equalsIgnoreCase("tchau")){
                    msg = teclado.nextLine();
                    saidaRede.println("Cliente: " + msg);
                }
                System.out.println("Cliente fechou conexão");
                fechou = true;
                servidor.close();
                cliente.close();
            } catch (IOException ex) {
                //Logger.getLogger(Treduri.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            //Logger.getLogger(Treduri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void run() {
        try(Scanner entradaRede = new Scanner(cliente.getInputStream()))
        {
            String msg = " ";
            while (!fechou && !msg.equalsIgnoreCase("tchau")){
                msg = entradaRede.nextLine();
                System.out.println("Servidor: " + msg);
            }
        } catch (IOException ex) {
            //Logger.getLogger(Treduri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

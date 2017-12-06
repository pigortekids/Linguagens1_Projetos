package cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente implements Runnable{

    static Socket cliente;
    static boolean fechou = false;
    
    public static void main(String[] args) {

        String serverAdress = JOptionPane.showInputDialog("Amanda o IP\nNa porta 5000");
        
        try {
            cliente = new Socket(serverAdress, 5000);

            Thread thr_entrada = new Thread(new Cliente());
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
                cliente.close();
            } catch (IOException ex) {
                //Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            //Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
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
            //Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

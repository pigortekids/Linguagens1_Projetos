

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rede {

    public static void main(String[] args) {
        
        try {
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("calmo bebe");
            while(true){
                
                Socket cliente = servidor.accept();
                //PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
                Scanner in = new Scanner(cliente.getInputStream());// pega do putty
                Scanner scan = new Scanner(System.in); // pega desse programa
                
                //System.out.println("cliente conectado: " + cliente.getInetAddress().getHostAddress());
                //ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                //saida.flush();
                //saida.writeObject(new Date());
                //saida.close();

                char[][] jogo = new char[3][3];
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        jogo[i][j] = '-';
                    }
                }
                
                saidaRede.println("Seja Bem vindo ao Jogo da Velha do Igão");
                
                String msg = " ";
                while(msg != "sair"){
                    
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            saidaRede.print(jogo[i][j] + " ");
                        }
                        saidaRede.println();
                    }
               
                    saidaRede.println("Em que posição deseja colocar?");
                    saidaRede.println("linha:");
                    int linha = in.nextInt();
                    saidaRede.print("coluna:");
                    int coluna = in.nextInt();
                    
                    jogo[linha][coluna] = 'x';
                   
                }
                in.close();
                scan.close();
                cliente.close();
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Rede.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

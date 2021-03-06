package cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cliente {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        Socket cliente;
        try {
            cliente = new Socket("127.0.0.1", 5000);
            Scanner entradaRede = new Scanner(cliente.getInputStream());
            Scanner teclado = new Scanner(System.in);
            PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
            System.out.println("batata");
            String msg = " ";
            while(msg != "sair"){
                while(entradaRede.hasNext()){
                    System.out.println(entradaRede.nextLine());
                }
                int valor = teclado.nextInt();
                saidaRede.flush();
                saidaRede.println(valor);
                
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        saidaRede.print(jogo[i][j] + " ");
                    }
                    saidaRede.println();
                }
                
                System.out.println("Em que posição deseja colocar?");
                System.out.print("linha:");
                int valor = teclado.nextInt();
                saidaRede.flush();
                saidaRede.println(valor);
                System.out.print("coluna:");
                coluna = scan.nextInt();

                jogo[linha][coluna] = 'o';
                entradaRede.nextInt();
                
            }
            cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

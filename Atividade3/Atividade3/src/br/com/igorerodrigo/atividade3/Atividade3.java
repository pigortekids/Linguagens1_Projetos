//Igor Amaral 15.00588-7
//Rodrigo Franciozi 14.04014-0

package br.com.igorerodrigo.atividade3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Atividade3 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();
        boolean saida = false;
        int decisao;
        do{
            System.out.println("\nOque deseja fazer:\n");
            System.out.println("1.Inserir\n2.Pesquisar\n3.Vender\n4.Relatorio\n5.Sair");
            decisao = scanner.nextInt();
            switch(decisao){
                case 1:
                    loja.colocarProduto();
                    break;
                case 2:
                    loja.pesquisarProduto();
                    break;
                case 3:
                    loja.venderProduto();
                    break;
                case 4:
                    loja.relatorio();
                    break;
                case 5:
                    saida = true;
                    break;
            }
        }while(!saida);
        
    }
    
}

package br.com.igao.eluja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class ELuja {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();
        String nome = "";
        /*boolean permissao = false;
        do{
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
            if(loja.conferirNome()){
                System.out.println("Digite sua senha:");
                String senha = scanner.next();
                if(loja.conferirSenha(nome)){
                    permissao = true;
                }
                else{
                    System.out.println("Senha inválida");
                }
            }
            else{
                System.out.println("Nome inválido");
            }
        }while(!permissao);*/
        loja.menuPrincipal(nome);
        
    }
    
}
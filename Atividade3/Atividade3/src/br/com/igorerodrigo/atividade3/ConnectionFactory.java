package br.com.igorerodrigo.atividade3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/atividade3", "root", "");
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}

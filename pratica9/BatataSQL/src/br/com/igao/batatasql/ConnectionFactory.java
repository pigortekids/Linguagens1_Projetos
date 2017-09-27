package br.com.igao.batatasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/batatashema", "root", "");
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}

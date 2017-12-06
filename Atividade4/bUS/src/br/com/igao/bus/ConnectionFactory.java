//Igor Correa 15.00588-7
//Rodrigo Franciozi 14.04014-0

package br.com.igao.bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/bus_travel", "root", "");
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}

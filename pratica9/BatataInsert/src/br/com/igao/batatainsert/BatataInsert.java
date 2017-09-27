package br.com.igao.batatainsert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatataInsert {

    public static void main(String[] args){
        
        Connection conexao = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO batatatable (nome,idade,ra) VALUES (?,?,?);";
        
        PreparedStatement ps;
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "Pot5jtyjtyj");
            ps.setInt(2, 20);
            ps.setString(3, "14.09876-0");
            if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(BatataInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

package br.com.igor.batatasql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatataSQL {

    public static void main(String[] args) {
        
        Connection conexao = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM batatatable;";
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while(resultadoQuery.next()){
                int id = resultadoQuery.getInt("id");
                String nome = resultadoQuery.getString("nome");
                int idade = resultadoQuery.getInt("idade");
                String ra = resultadoQuery.getString("ra");
                
                System.out.println(Integer.toString(id) + " nome: " + nome + " idade: " + idade + " ra: " + ra);
            }
            ps.close();
            conexao.close();
        }
        catch(SQLException ex){
            
        }
        
    }
    
}

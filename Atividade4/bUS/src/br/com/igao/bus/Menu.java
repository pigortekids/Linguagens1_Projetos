//Igor Correa 15.00588-7
//Rodrigo Franciozi 14.04014-0

package br.com.igao.bus;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean saida = false;
        
        while(!saida){
            System.out.println("-----------MENU-----------");
            System.out.println("1.Pesquisar clientes\n2.Pesquisar trajetos\n3.Cadastras clientes");
            System.out.println("4.Cadastrar trajetos\n5.Realizar reserva\n6.Pesquisar reservar");
            System.out.println("7.Gerar relatório\n8.Sair");
            System.out.println("--------------------------");

            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    pesquisarClientes();break;
                case 2:
                    pesquisarTrajetos();break;
                case 3:
                    cadastrarClientes();break;
                case 4:
                    cadastrarTrajetos();break;
                case 5:
                    realizarReserva();break;
                case 6:
                    pesquisarReservas();break;
                case 7:
                    gerarRelatorio();break; 
                case 8:
                    saida = true;break;
            }
        }
        
    }
    
    public static void pesquisarClientes(){
        
        Connection conexao = ConnectionFactory.getConnection();
        String sql;
        sql = "SELECT * FROM bus_travel.tbl_clientes;";
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("\nNome       CPF");
            while(rs.next()) {  
                String str1 = rs.getString("Nome");
                String str2 = rs.getString("CPF");
                System.out.println(str1 + "     " + str2);
            }
            System.out.println("\n");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void pesquisarTrajetos(){
        
        
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM bus_travel.tbl_trajetos;";
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("\nOrigem         Destino              data             assentos vagos   preço");
            while(rs.next()) {  
                String str1 = rs.getString("cid_origem");
                String str2 = rs.getString("cid_destino");
                int data = rs.getInt("data");
                java.util.Date utilDate = new java.util.Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(utilDate);
                cal.set(Calendar.MILLISECOND, data);
                String assentos = rs.getString("assentos_vagos");
                String preco = rs.getString("preco");
                System.out.println(str1 + "   " + str2 + "   " + new java.sql.Timestamp(utilDate.getTime()) + "   " + assentos + "   " + preco);
            }
            System.out.println("\n");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void cadastrarClientes(){
        
        Scanner scanner = new Scanner(System.in);
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO tbl_clientes (Nome, CPF) VALUES (?,?);";
        
        System.out.println("Digite o nome do Cliente");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF");
        String cpf = scanner.nextLine();
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, cpf);
            if (ps.execute()){
                System.out.println("Não realizou o cadastramento com sucesso\n\n");
            }
            else{
                System.out.println("Cliente cadastrado com sucesso\n\n");
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void cadastrarTrajetos(){
        
        Scanner scanner = new Scanner(System.in);
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO tbl_trajetos (cid_origem, cid_destino, data, assentos_vagos, preco) VALUES (?,?,?,?,?);";
        
        System.out.println("Digite a cidade de origem");
        String cidOrigem = scanner.nextLine();
        System.out.println("Digite a cidade de destino");
        String cidDestino = scanner.nextLine();
        System.out.println("Digite a data");
        String data = scanner.nextLine();
        System.out.println("Digite a quantidade de assentos");
        int assentos = scanner.nextInt();
        System.out.println("Digite o preço");
        float preco = scanner.nextFloat();
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, cidOrigem);
            ps.setString(2, cidDestino);
            ps.setString(3, data);
            ps.setInt(4, assentos);
            ps.setFloat(5, preco);
            if (ps.execute()){
                System.out.println("Não realizou o cadastramento com sucesso\n\n");
            }
            else{
                System.out.println("Trajeto cadastrado com sucesso\n\n");
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void realizarReserva(){
        
        Scanner scanner = new Scanner(System.in);
        pesquisarTrajetos();
        System.out.println("Qual o numero do trajeto que deseja reservar");
        int idT = scanner.nextInt();
        int assentos = 0;
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM tbl_trajetos WHERE id_trajeto = '" + idT + "'";
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {  
                assentos = rs.getInt("assentos_vagos");
            }
            if(assentos>0){
                assentos -= 1;
                sql = "UPDATE tbl_trajetos SET assentos_vagos = '" + assentos + "' WHERE id_trajeto = '" + idT + "';";
                st.execute(sql);
                pesquisarClientes();
                System.out.println("Digite o número do cliente que deseja reservar");
                int idC = scanner.nextInt();
                sql = "INSERT INTO tbl_reserva (id_trajeto, id_cliente) VALUES ('" + idT + "', '" + idC + "');";
                st.execute(sql);
            }
            else{
                System.out.println("Não tem assentos disponíveis");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void pesquisarReservas(){
        
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "SELECT t.cid_origem, t.cid_destino, t.data, c.Nome, c.CPF FROM tbl_trajetos AS t INNER JOIN tbl_reserva AS r ON r.id_trajeto = t.id_trajeto INNER JOIN tbl_clientes as c ON c.id_cliente = t.id_trajeto;";
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("cidade origem   cidade destino       data        nome         cpf");
            while(rs.next()) {  
                String str1 = rs.getString("cid_origem");
                String str2 = rs.getString("cid_destino");
                int data = rs.getInt("data");
                java.util.Date datinha = new java.util.Date((long)data*1000);
                String str4 = rs.getString("Nome");
                String str5 = rs.getString("CPF");
                System.out.println(str1 + "     " + str2 + "     " + datinha + "   " + str4 + "   " + str5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void gerarRelatorio(){
        
        Thread txt = new Thread(new GeradorRelatorios());
        txt.start();
        
    }
    
}

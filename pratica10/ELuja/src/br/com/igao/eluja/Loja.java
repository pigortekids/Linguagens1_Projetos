package br.com.igao.eluja;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loja {
    
    LinkedList<Produto> produtos = new LinkedList<Produto>();
    LinkedList<Carrinho> carrinhos = new LinkedList<Carrinho>();
    LinkedList<Pedido> pedidos = new LinkedList<Pedido>();
    Scanner scanner = new Scanner(System.in);
    
    
    /*Iterator<Ferramenta> i = ferramentas.iterator();
    while(i.hasNext()){
        content += i.next().getNome() + " ; " + i.next().getQuantidade() + "\n";
    }*/
    
    public void menuPrincipal(String nome){
        
        boolean sair = false;
        do{
            System.out.println("==============\nMENU PRINCIPAL\n==============\n\n");
            System.out.println("Oque deseja fazer?\n");
            System.out.println("1.Olhar produtos\n2.Olhar carrinho\n3.Sair");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    mostrarProdutos();
                    break;
                case 2:
                    mostrarCarrinho(nome);
                    break;
                case 3:
                    sair = true;
                    break;
                }
        }while(!sair);
        
        
    }
    
    public void mostrarProdutos(){
        
        Connection conexao = ConnectionFactory.getConnection();
        String sql;
        System.out.println("\n\n1.Todos os produtos\n2.comidas/bebidas\n3.eletrônicos");
            int escolha1 = scanner.nextInt();
            switch(escolha1){
                case 1:
                    sql = "SELECT * FROM eluja.tblprodutos;";
                    try {
                        Statement st = conexao.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        System.out.println("nome   preço  quantidade");
                        while(rs.next()) {  
                            String str1 = rs.getString("nome");
                            String str2 = rs.getString("preco");
                            String str3 = rs.getString("quantidade");
                            System.out.println(str1 + "     " + str2 + "     " + str3);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    sql = "SELECT * FROM eluja.tblprodutos WHERE tipo = 'comida' OR tipo = 'bebida';";
                    try {
                        Statement st = conexao.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        System.out.println("nome   preço  quantidade");
                        while(rs.next()) {  
                            String str1 = rs.getString("nome");
                            String str2 = rs.getString("preco");
                            String str3 = rs.getString("quantidade");
                            System.out.println(str1 + "     " + str2 + "     " + str3);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 3:
                    sql = "SELECT * FROM eluja.tblprodutos WHERE tipo = 'eletrônico';";
                    try {
                        Statement st = conexao.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        System.out.println("nome   preço  quantidade");
                        while(rs.next()) {  
                            String str1 = rs.getString("nome");
                            String str2 = rs.getString("preco");
                            String str3 = rs.getString("quantidade");
                            System.out.println(str1 + "     " + str2 + "     " + str3);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            }System.out.println("\nDeseja adicionar algum item ao seu carrinho?\n1.sim   2.não");
            int escolha2 = scanner.nextInt();
            if(escolha2 == 1){
                int idProduto = this.getIdProduto();
                 //COLOCAR O PRODUTO NO CARRINHO ................................................
            }
            
    }
    
    private int getIdProduto(){
        
        Connection conexao = ConnectionFactory.getConnection();
        boolean saida = false;
        System.out.println("Qual o nome do item que deseja adicionar?");
        do{
            String nomeProduto = scanner.next();
            String sql = "SELECT idProduto FROM eluja.tblprodutos WHERE nome = '" + nomeProduto + "';";
            try {
                Statement st = conexao.createStatement();
                ResultSet rs = st.executeQuery(sql);
                int idProduto = rs.getInt("idProduto");
                System.out.println("Produto encontrado");
                conexao.close();
                saida = true;
            } catch (SQLException ex) {
                System.out.println("Produto não encontrado\nDigite o nome do produto novamente");
            }
        }while(!saida);
        
        return idProduto; ////////////////////////////////////////////////////////////////////////
    }
    
    public void mostrarCarrinho(String nome){
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "SELECT p.nome, p.quantidade, p.preco FROM eluja.tblprodutos AS p"
                + "JOIN eluja.tblcarrinhos AS c"
                + "WHERE c.idusuario = '" + nome + "';"; //////////////////////////////ver se o join esta certo
        try {
            ps = conexao.prepareStatement(sql);
            System.out.println("  nome    quantidade    preco");
            System.out.println(ps);
            /*if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }*/
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean conferirNome(){ ////////////////////////////////////////alterar isso ainda
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "SELECT nome FROM eluja.tblusuarios;";
        try {
            ps = conexao.prepareStatement(sql);
            System.out.println(ps);
            
            /*if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }*/
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    public boolean conferirSenha(String usuario){ ////////////////////////////////////////alterar isso ainda
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "SELECT senha FROM eluja.tblusuarios WHERE nome = '" + usuario + "';";
        try {
            ps = conexao.prepareStatement(sql);
            
            /*if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }*/
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    public void adicionarAoCarrinho(int idUsuario, int idProduto, int quantidade){
        
        carrinhos.add(new Carrinho(idUsuario, idProduto, quantidade));
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO eluja.tblcarrinhos (`idusuario`, `idproduto`, `quantidade`) VALUES (?,?,?);";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, carrinhos.size()+1);
            ps.setInt(2, idUsuario);
            ps.setInt(3, quantidade);
            /*if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }*/
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void finalizarPedido(int idUsuario, String data, float preco){
        
        pedidos.add(new Pedido(pedidos.size()+1, idUsuario, data, preco));
        for ( int i=0 ; i<carrinhos.size() ; i++ ) {
            if(carrinhos.get(i).getIdUsuario() == idUsuario){
                carrinhos.remove(i);
                break;
            }
        }
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO eluja.tblpedidos (`idPedidos`, `idusuario`, `data`, `preco`) VALUES (?,?,?,?);";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, pedidos.size()+1);
            ps.setInt(2, idUsuario);
            ps.setString(3, data);
            ps.setFloat(4, preco);
            /*if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }*/
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ELuja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void gerarNota(){
        
        String fileName = "pedido" + Integer.toString(pedidos.size()) + ".txt";
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            //pegar infos do pedido
            String content = " ";
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}

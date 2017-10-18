package br.com.igao.eluja;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
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
    
    public void menuPrincipal(){
        
        boolean sair0 = false;
        do{
            System.out.println("==============\nMENU PRINCIPAL\n==============\n\n");
            System.out.println("Oque deseja fazer?\n");
            System.out.println("1.Olhar produtos\n2.Olhar carrinho\n3.Sair");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    sair0 = true;
                    break;
                }
        }while(!sair0);
        
        
    }
    
    public boolean conferirNome(){
        
        
        
        return false;
    }
    
    public void adicionarAoCarrinho(int idUsuario, int idProduto, int quantidade){
        
        carrinhos.add(new Carrinho(idUsuario, idProduto, quantidade));
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO `eluja`.`tblcarrinhos` (`idusuario`, `idproduto`, `quantidade`) VALUES (?,?,?);";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, carrinhos.size()+1);
            ps.setInt(2, idUsuario);
            ps.setInt(3, quantidade);
            if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }
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
            }
        }
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO `eluja`.`tblpedidos` (`idPedidos`, `idusuario`, `data`, `preco`) VALUES (?,?,?,?);";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, pedidos.size()+1);
            ps.setInt(2, idUsuario);
            ps.setString(3, data);
            ps.setFloat(4, preco);
            if (ps.execute()){
                System.out.println("SEM BATATA");
            }
            else{
                System.out.println("BATATA");
            }
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

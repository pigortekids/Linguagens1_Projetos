package br.com.igorerodrigo.atividade3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Loja {
    
    Connection conexao = ConnectionFactory.getConnection();
    PreparedStatement ps;
    Scanner scanner = new Scanner(System.in);
    LinkedList<Ferramenta> ferramentas = new LinkedList<Ferramenta>();
    LinkedList<Tinta> tintas = new LinkedList<Tinta>();
    public static int quantidadeProdutos = 0;
    private static final String fileName = "infos.txt";
    BufferedWriter bw = null;
    FileWriter fw = null;
    
    public void colocarProduto(){
        
        int decisao;
        do{
            System.out.println("\nQue produto deseja adicionar\n");
            System.out.println("1.Ferramenta\n2.Tinta");
            decisao = scanner.nextInt();
        }while((decisao != 1) && (decisao != 2));
        System.out.println("Digite o nome do produto:");
        String nome = scanner.next();
        System.out.println("Digite o quantidade do produto:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preco do produto:");
        double preco = scanner.nextDouble();
        if(decisao == 1){
            String sql = "INSERT INTO `atividade3`.`atividade3table` (`codigo`, `nome`, `quantidade`, `preco`, `marca`, `garantia`, `material`) VALUES (?,?,?,?,?,?,?);";
            System.out.println("Digite o marca do produto:");
            String marca = scanner.next();
            System.out.println("Digite o garantia do produto:");
            int garantia = scanner.nextInt();
            System.out.println("Digite o material do produto:");
            String material = scanner.next();
            try {
                ps = conexao.prepareStatement(sql);
                ferramentas.add(new Ferramenta(nome, quantidade, preco, marca, garantia, material));
                ps.setInt(1, Loja.quantidadeProdutos);
                ps.setString(2, nome);
                ps.setInt(3, quantidade);
                ps.setDouble(4, preco);
                ps.setString(5, marca);
                ps.setInt(6, garantia);
                ps.setString(7, material);
                if (ps.execute()){
                    System.out.println("Não funfou");
                }
                else{
                    System.out.println("Funfo");
                }
                ps.close();
                conexao.close();
            } catch (SQLException ex) {
                System.out.println("deu errado");
            }
        }
        else{
            String sql = "INSERT INTO `atividade3`.`atividade3table` (`codigo`, `nome`, `quantidade`, `preco`, `capacidade`) VALUES (?,?,?,?,?);";
            System.out.println("Digite o capacidade do produto:");
            int capacidade = scanner.nextInt();
            try {
                tintas.add(new Tinta(nome, quantidade, preco, capacidade));
                ps = conexao.prepareStatement(sql);
                ps.setInt(1, Loja.quantidadeProdutos);
                ps.setString(2, nome);
                ps.setInt(3, quantidade);
                ps.setDouble(4, preco);
                ps.setInt(5, capacidade);
                if (ps.execute()){
                    System.out.println("Não funfou");
                }
                else{
                    System.out.println("Funfou");
                }
                ps.close();
                conexao.close();
            } catch (SQLException ex) {
                System.out.println("deu errado");
            }
        }
        
    }
    
    public void pesquisarProduto(){
        
        int decisao;
        boolean saida = false;
        do{
            System.out.println("\nDigite o que deseja pesquisar:\n");
            System.out.println("1.Todos os produtos\n2.Apenas ferramentas\n3.Apenas tintas\n4.Sair");
            decisao = scanner.nextInt();
            switch(decisao){
                case 1:
                    Iterator<Ferramenta> i1 = ferramentas.iterator();
                    System.out.println("codigo   nome   preço   marca   garantia   material   capacidade");
                    while(i1.hasNext()){
                        System.out.println(i1.next().getCodigo() + "   " + i1.next().getNome() + "   ");
                        System.out.println(i1.next().getPreco() + "   " + i1.next().getMarca() + "   ");
                        System.out.println(i1.next().getGarantia() + "   " + i1.next().getMaterial());
                    }
                    Iterator<Tinta> j = tintas.iterator();
                    while(j.hasNext()){
                        System.out.println(j.next().getCodigo() + "   " + j.next().getNome() + "   ");
                        System.out.println(j.next().getPreco() + "   " + j.next().getCapacidade());
                    }
                    break;
                case 2:
                    Iterator<Ferramenta> i2 = ferramentas.iterator();
                    System.out.println("codigo   nome   preço   marca   garantia   material");
                    while(i2.hasNext()){
                        System.out.println(i2.next().getCodigo() + "   " + i2.next().getNome() + "   ");
                        System.out.println(i2.next().getPreco() + "   " + i2.next().getMarca() + "   ");
                        System.out.println(i2.next().getGarantia() + "   " + i2.next().getMaterial());
                    }
                    break;
                case 3:
                    Iterator<Tinta> j1 = tintas.iterator();
                    while(j1.hasNext()){
                        System.out.println(j1.next().getCodigo() + "   " + j1.next().getNome() + "   ");
                        System.out.println(j1.next().getPreco() + "   " + j1.next().getCapacidade());
                    }
                    break;
                case 4:
                    saida = true;
                    break;
            }
        }while(saida);
        
    }
    
    public void venderProduto(){
        
        boolean achou = false;
        System.out.println("\nDigite o codigo do produto que deseja vender:");
        int produto = scanner.nextInt();
        System.out.println("\nDigite a quantidade que deseja vender:");
        int quantidade = scanner.nextInt();
        Iterator<Ferramenta> i = ferramentas.iterator();
        while(i.hasNext()){
            if(i.next().getCodigo()== produto){
                achou = true;
                if(quantidade <= i.next().getQuantidade()){
                    i.next().setQuantidade(i.next().getQuantidade() - quantidade);
                    try {
                        String sql = "UPDATE `atividade3`.`atividade3table` SET `quantidade`='?' WHERE `codigo`='?'";
                        ps = conexao.prepareStatement(sql);
                        ps.setInt(1, i.next().getQuantidade());
                        ps.setInt(2, produto);
                        if (ps.execute()){
                            System.out.println("Não funfou");
                        }
                        else{
                            System.out.println("Funfou");
                        }
                        ps.close();
                        conexao.close();
                    } catch (SQLException ex) {
                        System.out.println("deu errado");
                    }
                }
                else{
                    System.out.println("Quantidade insuficiente para realizar a venda\n");
                }
            }
        }
        if(!achou){
            Iterator<Tinta> j = tintas.iterator();
            while(j.hasNext()){
                if(j.next().getCodigo()== produto){
                    achou = true;
                    if(quantidade <= j.next().getQuantidade()){
                        j.next().setQuantidade(j.next().getQuantidade() - quantidade);
                        try {
                            String sql = "UPDATE `atividade3`.`atividade3table` SET `quantidade`='?' WHERE `codigo`='?'";
                            ps = conexao.prepareStatement(sql);
                            ps.setInt(1, i.next().getQuantidade());
                            ps.setInt(2, produto);
                            if (ps.execute()){
                                System.out.println("Não funfou");
                            }
                            else{
                                System.out.println("Funfou");
                            }
                            ps.close();
                            conexao.close();
                        } catch (SQLException ex) {
                            System.out.println("deu errado");
                        }
                    }
                    else{
                        System.out.println("Quantidade insuficiente para realizar a venda\n");
                    }
                }
            }
        }
        if(!achou){
            System.out.println("Código de produto não encontrado");
        }
    }
        
        public void relatorio(){
            Iterator<Ferramenta> i = ferramentas.iterator();
            String content = "";
            while(i.hasNext()){
                content += i.next().getNome() + " ; " + i.next().getQuantidade() + "\n";
            }
            Iterator<Tinta> j = tintas.iterator();
            while(i.hasNext()){
                content += j.next().getNome() + " ; " + j.next().getQuantidade() + "\n";
            }
            try {
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

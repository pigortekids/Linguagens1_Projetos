package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeComprar {
    
    ArrayList<Item> lista = new ArrayList<Item>();
    Scanner scanner = new Scanner(System.in);
    
    public void adicionarItem(){
        System.out.println("Oque deseja adicionar em seu carrinho:");
        String nome = scanner.next();
        System.out.println("Qual o preço desse item:");
        double preco = scanner.nextDouble();
        System.out.println("Qual a quantidade que deseja adicionar:");
        int quantidade = scanner.nextInt();
        lista.add(new Item(nome, preco, quantidade));
    }
    
    public void removerPorNome(){
        System.out.println("Qual o nome do item que deseja retirar:");
        String nome = scanner.next();
        for(int i = 0 ; i<lista.size() ; i++){
            if(lista.get(i).getNome().equals(nome)){
                lista.remove(i);
                System.out.println("\nremovido com sucesso\n\n");
            }
        }
    }
    
    public void listarItens(){
        System.out.println("");
        for(int i = 0 ; i<lista.size() ; i++){
            System.out.println(i + " - " + lista.get(i).getNome());
            System.out.print("  R$" + lista.get(i).getPreco());
            System.out.println("    quantidade --> " + lista.get(i).getQuantidade());
        }
        System.out.println("");
    }
    
    public void procurarItem(){
        System.out.println("Qual o nome do item que deseja procurar");
        String nome = scanner.next();
        for(int i = 0 ; i<lista.size() ; i++){
            if(lista.get(i).getNome().equals(nome)){
                System.out.println(lista.get(i).getNome());
                System.out.print("  R$" + lista.get(i).getPreco());
                System.out.println("    quantidade --> " + lista.get(i).getQuantidade());
            }
        }
    }
    
    public void modificarItem(){
        System.out.println("Qual o nome do item que deseja procurar");
        String nome = scanner.next();
        for(int i = 0 ; i<lista.size() ; i++){
            if(lista.get(i).getNome().equals(nome)){
                System.out.println("Qual item quer adicionar");
                nome = scanner.next();
                System.out.println("Qual o preço desse item:");
                double preco = scanner.nextDouble();
                System.out.println("Qual a quantidade que deseja adicionar:");
                int quantidade = scanner.nextInt();
                lista.remove(i);
                lista.add(i, new Item(nome, preco, quantidade));
            }
        }
    }
    
}

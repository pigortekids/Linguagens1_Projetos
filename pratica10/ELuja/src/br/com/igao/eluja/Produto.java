package br.com.igao.eluja;

public class Produto {
    
    private int id;
    private String nome;
    private float preco;
    private int quantidade;
    
    public Produto(int id, String nome, float preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
}

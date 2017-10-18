package br.com.igao.eluja;

public class Carrinho {
    
    private int idUsuario;
    private int idProduto;
    private int quantidade;
    
    public Carrinho(int idUsuario, int idProduto, int quantidade){
        
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        
    }
    
    public int getIdUsuario(){
        return this.idUsuario;
    }
    
}

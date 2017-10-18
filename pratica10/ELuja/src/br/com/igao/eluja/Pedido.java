package br.com.igao.eluja;

public class Pedido {
    
    private int id;
    private int idUsuario;
    private String data;
    private float preco;
    
    public Pedido(int id, int idUsuario, String data, float preco){
        
        this.id = id;
        this.idUsuario = idUsuario;
        this.data = data;
        this.preco = preco;
        
    }
    
}

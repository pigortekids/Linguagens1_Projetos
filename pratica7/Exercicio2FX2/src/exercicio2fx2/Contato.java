package exercicio2fx2;

public class Contato {
    
    private String nome;
    private String numero;
    
    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setNumero(String novoNumero){
        this.numero = novoNumero;
    }
    
}
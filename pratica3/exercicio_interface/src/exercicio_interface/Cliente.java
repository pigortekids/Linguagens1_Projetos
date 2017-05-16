package exercicio_interface;

public class Cliente implements IAutenticavel, IImprimivel {
    
    private String senha;
    private String cpf;
    private String nome;
    
    public Cliente(String nome, String cpf, String senha){
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    @Override
    public void imprimir(){
        System.out.println("imprimindo...");
    }
    
    @Override
    public boolean autenticar(String s){
        return this.senha.equals(s);
    } 
    
}

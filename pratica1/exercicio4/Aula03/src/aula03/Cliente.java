package aula03;

public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Cliente(String nomeInicial, String sobrenomeInicial, String cpfInicial){
        this.nome = nomeInicial;
        this.sobrenome = sobrenomeInicial;
        this.cpf = cpfInicial;
    }
    
    public void mostrar(){
        System.out.print("Nome --> " + this.nome + " " + this.sobrenome + "\n" +
                "CPF ---> " + this.cpf + "\n");
    }
    
    public void setNome(String nome1){
        this.nome = nome1;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getCPF(){
        return this.cpf;
    }
}

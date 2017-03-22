// Igor Amaral Correa 15.00588-7
// Rodrigo Franciozi Rodrigues da Silva 14.04014-0

package atividade1;

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
    
    public void setNome(String nome){
        this.nome = nome;
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

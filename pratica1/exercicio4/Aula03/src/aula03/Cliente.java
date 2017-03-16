package aula03;

public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Cliente(){
        this.nome = "Batata";
        this.sobrenome = "Frita";
        this.cpf = "328.926.788-11";
    }
    
    public void mostrar(){
        System.out.print("Nome --> " + this.nome + " " + this.sobrenome + "\n" +
                "CPF ---> " + this.cpf + "\n");
    }
    
    public void setNome(String nome){
        String nome1 = nome.toLowerCase();
        this.nome = nome1;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
}

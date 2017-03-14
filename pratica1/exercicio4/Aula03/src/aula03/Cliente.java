package aula03;

public class Cliente {
    
    String nome;
    String sobrenome;
    String cpf;
    
    void mostrar(){
        System.out.print("Nome -> " + this.nome + " " + this.sobrenome + "\n" +
                "CPF --> " + this.cpf + "\n");
    }
    
}

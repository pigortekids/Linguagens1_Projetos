package concessionaria;

public class Gerente extends Vendedor{
    
    private int senha;
    private int numeroDeFuncionarios;
    
    public Gerente(String nome, String cpf, double salarioBase, 
            double decimoTerceiro, int horasExtras, int senha, int numeroDeFuncionarios){
        super(nome, cpf, salarioBase, decimoTerceiro, horasExtras);
        this.senha = senha;
        this.numeroDeFuncionarios = numeroDeFuncionarios;
        
    }
    
    public boolean autentica(int s){
        if(this.senha == s){
            System.out.println("Acesso Permitido");
            return true;
        }
        else{
            System.out.println("Acesso Negado");
            return false;
        }
    }
    
    
    
}

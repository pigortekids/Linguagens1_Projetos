package concessionaria;

public class Gerente extends Vendedor{
    
    private int senha;
    private int numeroDeFuncionarios;
    
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

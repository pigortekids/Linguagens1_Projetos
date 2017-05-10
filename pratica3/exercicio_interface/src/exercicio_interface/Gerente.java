package exercicio_interface;

public class Gerente extends Funcionario implements IAutenticavel{
    
    int senha;
    
    @Override
    public boolean autenticar(int s){
        if(this.senha == s){
            return true;
        }
        else{
            return false;
        }
    }
    
}

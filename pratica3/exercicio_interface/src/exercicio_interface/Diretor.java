package exercicio_interface;

public class Diretor extends Funcionario implements IAutenticavel{
    
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

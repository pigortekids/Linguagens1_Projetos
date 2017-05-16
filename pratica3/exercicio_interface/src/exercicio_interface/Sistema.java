package exercicio_interface;

public class Sistema {
    
    public boolean login( IAutenticavel objeto, Funcionario f, String senhaDeAcesso ){
        
        return objeto.autenticar(senhaDeAcesso);
        
    }
    
}

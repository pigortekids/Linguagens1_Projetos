package exercicio_interface;

public class Diretor extends Funcionario implements IAutenticavel{
    
    private String senha;
    
    public Diretor(String nome, String cpf, int registro, double salarioBase, String senha) {
        super(nome, cpf, registro, salarioBase);
        this.senha = senha;
    }
    
    public boolean alterarSenha(String senhaNova, String senhaAntiga){
        boolean retorno = false;
        
        if(this.autenticar(senhaAntiga)){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;
    }
    
    public boolean darAumento(Funcionario f, String senha, double valor){
        
        boolean retorno = false;
        
        if(this.autenticar(senha)){
            f.setSalario(f.getSalario() + valor);
            retorno = true;
        }
        return retorno;
    }
    
    @Override
    public boolean autenticar(String s){
        return this.senha.equals(s);
    }
    
}

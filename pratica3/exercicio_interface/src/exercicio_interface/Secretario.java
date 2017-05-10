package exercicio_interface;

public class Secretario extends Funcionario implements IExibicao{
    
    
@Override
    public void exibir(){
        System.out.println("exibir coisas");
    }
    public void buscarCafe(){
        System.out.println("estou pegando café");
    }
    public void atenderTelefone(){
        System.out.println("estou atendendo telefone");
    }
}

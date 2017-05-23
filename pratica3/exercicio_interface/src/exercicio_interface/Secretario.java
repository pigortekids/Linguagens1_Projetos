package exercicio_interface;

public class Secretario extends Funcionario implements IExibicao{
    
    public Secretario(String nome, String cpf, int registro, double salarioBase) {
        super(nome, cpf, registro, salarioBase);
    }
    
@Override
    public void exibir(){
        System.out.println(this.getNome() + "\n" + this.getCPF());
        System.out.println(this.getRegistro() + "\n" + this.getRegistro());
    }
    public boolean buscarCafe(){
        System.out.println("estou pegando café");
        return true;
    }
    public boolean atenderTelefone(){
        System.out.println("estou atendendo telefone");
        return true;
    }
}
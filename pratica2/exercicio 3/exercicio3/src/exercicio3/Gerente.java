package exercicio3;

public class Gerente extends Funcionario {
    
    private double comissao;
    
    public void valorComissao(double vendas, double extra){
        this.comissao = 0.03*vendas + 0.25*getSalarioBase() + extra;
    }
    
}

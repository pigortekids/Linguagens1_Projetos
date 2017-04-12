package exercicio3;

public class Vendedor extends Funcionario {
    
    private double comissao;
    
    public void valorComissao(double vendas, double extra){
        this.comissao = 0.03*vendas + extra;
    }
    
}

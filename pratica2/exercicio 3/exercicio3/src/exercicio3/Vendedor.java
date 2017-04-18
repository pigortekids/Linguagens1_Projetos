package exercicio3;

public class Vendedor extends Funcionario {
    
    private double comissao;
    private static double taxaVendedor = 0.03;
    private double totalVendas;
    
    public void valorComissao(double extra){
        this.comissao = Vendedor.taxaVendedor*this.totalVendas + 
                extra;
    }
    
    public void valorSalario(){
        this.salario = this.salarioBase + this.comissao;
    }
    
    public void venda(double valor){
        this.totalVendas += valor;
        this.concessionaria.adicionarVenda(valor);
    }
    
}

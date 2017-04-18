package exercicio3;

public class Gerente extends Funcionario {
    
    private double comissao;
    private static double taxaGerente = 0.05;
    private double totalVendas;
    
    public void valorComissao(double extra){
        this.comissao = Gerente.taxaGerente*this.totalVendas + 
                0.25*this.salarioBase + extra;
    }
    
    public void valorSalario(){
        this.salario = this.salarioBase + this.comissao;
    }
    
    public void venda(double valor){
        this.totalVendas += valor;
        this.concessionaria.adicionarVenda(valor);
    }
    
}

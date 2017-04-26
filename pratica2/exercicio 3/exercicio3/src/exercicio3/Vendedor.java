package exercicio3;

public class Vendedor extends Funcionario {
    
    private double comissao;
    private static double taxaVendedor = 0.03;
    private double totalVendas = 0;
    private Gerente gerente;
    
    public Vendedor(String nome, String cpf, int registro, double salarioBase) {
        super(nome, cpf, registro, salarioBase);
    }
    
    public void valorComissao(double bonificacao){
        this.comissao = Vendedor.taxaVendedor*this.totalVendas + bonificacao;
    }
    
    public void valorSalario(){
        this.salario = this.salarioBase + this.comissao;
    }
    
    public void venda(double valor){
        this.totalVendas += valor;
    }
    
    public void zerarVendas(){
        this.totalVendas = 0;
    }
    
    public double getTotalVendas(){
        return this.totalVendas;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Vendas: " + this.totalVendas);
    }
    
}

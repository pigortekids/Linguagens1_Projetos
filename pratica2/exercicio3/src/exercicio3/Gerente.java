package exercicio3;

public class Gerente extends Funcionario {
    
    private double comissao;
    private static double taxaGerente = 0.05;
    private double totalVendas = 0;

    public Gerente(String nome, String cpf, int registro, double salarioBase) {
        super(nome, cpf, registro, salarioBase);
    }
    
    public void valorComissao(double bonificacao){
        this.comissao = Gerente.taxaGerente*this.totalVendas + 
                0.25*this.salarioBase + bonificacao;
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

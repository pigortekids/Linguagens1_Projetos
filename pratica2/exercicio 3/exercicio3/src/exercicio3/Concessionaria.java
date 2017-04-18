package exercicio3;

public class Concessionaria {
    
    private int totalFuncionarios;
    private double totalVendas;
    
    public void maisUmFuncionario(){
        this.totalFuncionarios += 1;
    }
    
    public void adicionarVenda(double valor){
        this.totalVendas += valor;
    }
    
}

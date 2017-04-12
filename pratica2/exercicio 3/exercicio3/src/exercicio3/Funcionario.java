package exercicio3;

public class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    /*protected static double totalVendas;
    protected static double taxasVendaTotais;
    private static int totalFuncionarios = 0;*/
    
    public Funcionario(String nome, String cpf, int registro, double salarioBase){
        
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salarioBase = salarioBase;
        //Funcionario.totalFuncionarios += 1;
        
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
}

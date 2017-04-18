package exercicio3;

public class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected double salario;
    protected static double taxaGeral = 0.05;
    protected Concessionaria concessionaria;
    
    public Funcionario(String nome, String cpf, int registro, double salarioBase){
        
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salarioBase = salarioBase;
        this.concessionaria.maisUmFuncionario();
        
    }
    
}

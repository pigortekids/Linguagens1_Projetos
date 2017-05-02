package exercicio3;

public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected double salario;
    protected Concessionaria concessionaria;
    
    public Funcionario(String nome, String cpf, int registro, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salarioBase = salarioBase;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public int getRegistro(){
        return this.registro;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salario Base: " + this.salarioBase);
    }
    
}

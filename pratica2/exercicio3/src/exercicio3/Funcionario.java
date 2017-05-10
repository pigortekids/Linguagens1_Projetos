package exercicio3;

public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
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
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public int getRegistro(){
        return this.registro;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public void setSalarioBase(double salario){
        this.salarioBase = salario;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salario Base: " + this.salarioBase);
    }
    
}

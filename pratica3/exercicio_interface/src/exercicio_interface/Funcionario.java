package exercicio_interface;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome, String cpf, int registro, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salario = salario;
    }
    
    public int getRegistro(){
        return this.registro;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}

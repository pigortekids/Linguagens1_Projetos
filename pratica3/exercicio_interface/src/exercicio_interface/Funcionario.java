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
    public int getNome(){
        return this.registro;
    }
    public int getCPF(){
        return this.registro;
    }
    public int getSalario(){
        return this.registro;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}

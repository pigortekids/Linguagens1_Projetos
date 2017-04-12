package concessionaria;

public class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected double comissao;
    protected double salarioBase;
    protected double decimoTerceiro;
    protected int horasExtras;
    
    public Funcionario(String nome, String cpf, double salarioBase, 
            double decimoTerceiro, int horasExtras){
        
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.decimoTerceiro = decimoTerceiro;
        this.horasExtras = horasExtras;
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    
    public void setComissao(double comis){
        this.comissao = comis;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public double getDecimoTerceiro(){
        return this.decimoTerceiro;
    }
    
    
    
}

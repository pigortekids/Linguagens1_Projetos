package aula03;

public class Conta {
    // atributos
    private int numero;
    private double saldo;
    public Cliente titular = new Cliente();
    
    //métodos
    public Conta(){
        this.saldo = 0;
    }
    
    public void vizualizarSaldo(){
        System.out.println("Saldo -> R$" + this.saldo);
    }
    
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
        }
        else{
            System.out.println("valor errado digitado");
        }
    }
    
    public boolean sacar(double valor){
        if(this.saldo - valor < 0){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    
    public void transferirPara(Conta conta1, double valor){
        if(this.sacar(valor)){
            conta1.depositar(valor);
        }
        else{
            System.out.println("Sem dinheiro suficiente para transferir");
        }
    }
                
}

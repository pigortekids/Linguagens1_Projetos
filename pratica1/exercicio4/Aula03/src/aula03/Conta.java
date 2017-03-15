package aula03;

public class Conta {
    // atributos
    private int numero;
    private Cliente titular = new Cliente();
    private double saldo = 0;
    
    //métodos
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
    
    public void setNome(String nome){
        this.titular.setNome(nome);
    }
                
}

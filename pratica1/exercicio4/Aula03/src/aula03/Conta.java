package aula03;

public class Conta {
    // atributos
    int numero;
    Cliente titular;
    double saldo;
    
    //métodos
    void vizualizarSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
        }
        else{
            System.out.println("valor errado digitado");
        }
    }
    boolean sacar(double valor){
        if(this.saldo - valor < 0){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    void transferirPara(Conta conta1, double valor){
        if(this.sacar(valor)){
            conta1.depositar(valor);
        }
        else{
            System.out.println("Sem dinheiro suficiente para transferir");
        }
    }
    
}

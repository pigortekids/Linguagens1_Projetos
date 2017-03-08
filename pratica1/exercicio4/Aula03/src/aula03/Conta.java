package aula03;

public class Conta {
    // atributos
    int numero;
    String titular;
    String cpf;
    double saldo;
    
    //métodos
    void vizualizarSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    void depositar(int valor){
        if(valor>0){
            this.saldo += valor;
        }
        else{
            System.out.println("valor errado digitado");
        }
    }
    void sacar(int valor){
        if(valor>0){
            if(this.saldo - valor < 0){
                System.out.println("não tem dinheiro suficiente para sacar");
            }
            else{
                this.saldo -= valor;
            }
        }
        else{
            System.out.println("valor errado digitado");
        }
    }
    void transferirDinheiro(){
        
    }
    
}

package aula03;

public class Aula03 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.saldo = -100,0;
        c1.vizualizarSaldo();
        c1.depositar(1000);
        c1.vizualizarSaldo();
        c1.sacar(500);
        c1.vizualizarSaldo();
        
    }
    
}

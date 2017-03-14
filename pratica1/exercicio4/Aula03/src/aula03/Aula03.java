package aula03;

public class Aula03 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.titular = new Cliente();
        c1.saldo = 100;
        c1.titular.nome = "Batata";
        c1.titular.sobrenome = "Frita";
        c1.titular.cpf = "328.926.788-11";
        c1.titular.mostrar();
        
    }
    
}

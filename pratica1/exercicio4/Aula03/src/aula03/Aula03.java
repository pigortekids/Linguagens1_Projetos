package aula03;

public class Aula03 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.vizualizarSaldo();
        c1.setNome("Batata");
        c1.titular.setSobrenome("Frita");
        c1.titular.setCPF("328.926.788-11");
        c1.titular.mostrar();
        
    }
    
}

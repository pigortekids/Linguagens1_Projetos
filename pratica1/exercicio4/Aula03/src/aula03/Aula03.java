package aula03;

public class Aula03 {

    public static void main(String[] args) {
        
        //int total = Conta.getTotalDeContas();
        Conta c1 = new Conta("Batata", "Frita", "157", 500);
        c1.vizualizarSaldo();
        c1.mostrarTudo();
        System.out.println(c1.getNome());
        c1.setNome("Garganta");
        System.out.println(c1.getNome());
        System.out.println(Conta.getTotalDeContas());
        
    }
    
}

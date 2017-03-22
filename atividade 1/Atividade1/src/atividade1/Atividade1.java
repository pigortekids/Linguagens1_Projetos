// Igor Amaral Correa 15.00588-7
// Rodrigo Franciozi Rodrigues da Silva 14.04014-0

package atividade1;


public class Atividade1 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(1000, "Amilton", "Dias", "111.111.111-11", 'r', 250);
        Conta c2 = new Conta(3000, "Henrique", "Diniz", "222.222.222-22", 'd', 1000);
        Conta c3 = new Conta(200, "Leonardo", "Nomo", "333.333.333-33", 'e', 12000);
        Conta c4 = new Conta(1800, "Alberto", "Roberto", "444.444.444-44", 'r', 0);
        
        c2.transferirPara(c1, 700);
        c2.transferirPara(c3, 200);
        c2.exibirTodasInformacoesDaConta();
        System.out.println();
        c1.exibirTodasInformacoesDaConta();
        System.out.println();
        c3.exibirTodasInformacoesDaConta();
        System.out.println("\n\n\n");
        
        c1.sacar(1800);
        c1.transferirPara(c4, 200);
        c1.exibirTodasInformacoesDaConta();
        System.out.println();
        c4.exibirTodasInformacoesDaConta();
        System.out.println();
        System.out.println("\n\n\n");
        
        c3.transferirPara(c4, 10000);
        c3.transferirPara(c2, 1000);
        c3.exibirTodasInformacoesDaConta();
        System.out.println();
        c4.exibirTodasInformacoesDaConta();
        System.out.println();
        c2.exibirTodasInformacoesDaConta();
        System.out.println();
        System.out.println("\n\n\n");
        
        c3.depositar(22000);
        
        c1.exibirTodasInformacoesDaConta();
        System.out.println();
        c2.exibirTodasInformacoesDaConta();
        System.out.println();
        c3.exibirTodasInformacoesDaConta();
        System.out.println();
        c4.exibirTodasInformacoesDaConta();
        System.out.println();
        
    }
    
}

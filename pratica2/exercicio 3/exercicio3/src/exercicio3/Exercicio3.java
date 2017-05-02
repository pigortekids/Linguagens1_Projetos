package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos vendedores? ");
        int n = scanner.nextInt();
        System.out.print("Quantos gerentes? ");
        int m = scanner.nextInt();
        
        Concessionaria c1 = new Concessionaria(n, m); 
        c1.novoGerente( "Roberto", "123.123.123-12", 1, 2000 );
        c1.novoVendedor( "Pedro", "111.111.111-11", 2, 1000 );
        
        
    }
    
}

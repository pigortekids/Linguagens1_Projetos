package exercicio1;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1 {

    public static void main(String[] args) {
        
        ListaDeComprar lista = new ListaDeComprar();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========\nBEM VINDO\n=========\n");
        boolean sair = false;
        do{
            System.out.println("Oque deseja fazer?\n");
            System.out.println("1-Adicionar item\n2-Remover item\n3-Listar os itens\n4-Procurar item\n5-Modificar item\n6-Sair\n");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    lista.adicionarItem(); break;
                case 2:
                    lista.removerPorNome(); break;
                case 3:
                    lista.listarItens(); break;
                case 4:
                    lista.procurarItem(); break;
                case 5:
                    lista.modificarItem(); break;
                case 6:
                    sair = true; break;
            }
        }while(!sair);
    }
    
}

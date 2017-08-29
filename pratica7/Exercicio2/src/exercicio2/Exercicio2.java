package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        ListaDeContatos lista = new ListaDeContatos();
        Scanner scanner = new Scanner(System.in);
        
        boolean sair = false;
        do{
            System.out.println("Oque deseja fazer?\n");
            System.out.println("1-Adicionar contato\n2-Ver lista de contatos\n3-Sair\n");
            int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    lista.adicionarContato(); break;
                case 2:
                    lista.mostrarContatos();
                    lista.editarContatos(); 
                    break;
                case 3:
                    sair = true; break;
            }
        }while(!sair);
        
    }
    
}

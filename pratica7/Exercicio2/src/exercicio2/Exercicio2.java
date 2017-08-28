package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        ListaDeContatos lista = new ListaDeContatos();
        Scanner scanner = new Scanner(System.in);
        String nome;
        String numero;
        
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
                    boolean sair2 = false;
                    do{
                        System.out.println("Oque deseja Fazer");
                        System.out.println("1-Alterar um contato\n2-Sair");
                        int escolha2 = scanner.nextInt();
                        switch(escolha2){
                            case 1:
                                System.out.println("Digite o numero do contato que deseja alterar");
                                int index = scanner.nextInt();
                                index -= 1;
                                System.out.println("Oque deseja fazer:");
                                System.out.println("1-Alterar nome\n2-Alterar numero\n3-Ambos");
                                int escolha3 = scanner.nextInt();
                                switch(escolha3){
                                    case 1:
                                        System.out.println("Qual nome deseja colocar?");
                                        nome = scanner.next();
                                        lista.getContato(index).setNome(nome);
                                        break;
                                    case 2:
                                        System.out.println("Qual numero deseja colocar?");
                                        numero = scanner.next();
                                        lista.getContato(index).setNome(numero);
                                        break;
                                    case 3:
                                        System.out.println("Qual nome deseja colocar?");
                                        nome = scanner.next();
                                        System.out.println("Qual numero deseja colocar?");
                                        numero = scanner.next();
                                        lista.getContato(index).setNome(nome);
                                        lista.getContato(index).setNumero(numero);
                                        break;
                                }
                            case 2:
                                sair2 = true;
                        }
                    }while(!sair2); break;
                case 3:
                    sair = true; break;
            }
        }while(!sair);
        
    }
    
}

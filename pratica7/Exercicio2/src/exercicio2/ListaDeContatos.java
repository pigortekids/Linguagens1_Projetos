package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeContatos {
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contato> lista = new ArrayList<Contato>();
    
    public void adicionarContato(){
        System.out.println("Digite o nome do novo contato:");
        String nome = scanner.next();
        System.out.println("Digite o numero do novo contato:");
        String numero = scanner.next();
        lista.add(new Contato(nome, numero));
    }
    
    public void mostrarContatos(){
        for(int i = 0 ; i<lista.size() ; i++){
            System.out.println("\n" + i+1 + "-" + lista.get(i).getNome() + "   " + lista.get(i).getNumero() + "\n");
        }
    }
    
    public Contato getContato(int i){
        return lista.get(i);
    }
    
    public void editarContatos(){
        String nome;
        String numero;
        boolean sair = false;
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
                            this.getContato(index).setNome(nome);
                            break;
                        case 2:
                            System.out.println("Qual numero deseja colocar?");
                            numero = scanner.next();
                            this.getContato(index).setNome(numero);
                            break;
                        case 3:
                            System.out.println("Qual nome deseja colocar?");
                            nome = scanner.next();
                            System.out.println("Qual numero deseja colocar?");
                            numero = scanner.next();
                            this.getContato(index).setNome(nome);
                            this.getContato(index).setNumero(numero);
                            break;
                    }
                case 2:
                    sair = true;
            }
        }while(!sair);
    }
    
    
    
}

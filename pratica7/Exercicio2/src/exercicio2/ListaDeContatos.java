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
            System.out.println(i+1 + "-" + lista.get(i).getNome() + "   " + lista.get(i).getNumero());
        }
    }
    
    public Contato getContato(int i){
        return lista.get(i);
    }
    
    
    
}

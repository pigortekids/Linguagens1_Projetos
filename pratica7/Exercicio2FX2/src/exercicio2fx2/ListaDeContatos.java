package exercicio2fx2;

import java.util.ArrayList;

public class ListaDeContatos {
    
    ArrayList<Contato> lista = new ArrayList<Contato>();
    
    public void adicionarContato(String nome, String numero){
        lista.add(new Contato(nome, numero));
    }
    
    public void removerContato(int index){
        lista.remove(index);
    }
    
    public void editarNome(int index, String nome){
        lista.get(index).setNome(nome);
    }
    
    public void editarNumero(int index, String numero){
        lista.get(index).setNome(numero);
    }
    
}

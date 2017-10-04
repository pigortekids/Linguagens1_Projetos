package br.com.igorerodrigo.atividade3;

public class Tinta extends Produto {
    
    private int capacidade;

    public Tinta(String nom, int qua, double pre, int cap) {
        super(nom, qua, pre);
        this.capacidade = cap;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}

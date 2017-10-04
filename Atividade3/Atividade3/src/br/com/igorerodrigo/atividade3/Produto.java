package br.com.igorerodrigo.atividade3;

public abstract class Produto {
    
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;
    
    public Produto(String nom, int qua, double pre){
        Loja.quantidadeProdutos += 1;
        this.codigo = Loja.quantidadeProdutos;
        this.nome = nom;
        this.quantidade = qua;
        this.preco = pre;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}

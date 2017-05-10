package exercicio3;

public class Concessionaria {
    
    private int totalFuncionarios = 0;
    private double taxaBonus = 0.05;
    private int nVend = 0;
    private Vendedor[] vendedor;
    private int nGere = 0;
    private Gerente[] gerente;
    
    public Concessionaria(int nVendedores, int nGerentes){
        vendedor = new Vendedor[nVendedores];
        gerente = new Gerente[nGerentes];
    }
    
    public boolean novoVendedor(String nome, String cpf, int registro, double salarioBase){
        boolean resultado;
        if(this.nVend < this.vendedor.length){
            this.vendedor[this.nVend] = new Vendedor(nome, cpf, registro, salarioBase);
            this.nVend++;
            this.totalFuncionarios++;
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }
    
    public boolean novoGerente(String nome, String cpf, int registro, double salarioBase){
        boolean resultado;
        if(this.nGere < this.gerente.length){
            this.gerente[this.nGere] = new Gerente(nome, cpf, registro, salarioBase);
            this.nGere++;
            this.totalFuncionarios++;
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }
    
    public double calculoBonificaca(){
        return ( ( this.calcularTotalVendas() / this.totalFuncionarios) * this.taxaBonus);
    }
    
    private double calcularTotalVendas(){
        double total = 0;
        for( int i=0 ; i<this.nVend ; i++){
            total += this.vendedor[i].getTotalVendas();
        }
        for( int i=0 ; i<this.nGere ; i++){
            total += this.gerente[i].getTotalVendas();
        }
        return total;
    }
    
    public void setTaxaBonus(double tB){
        this.taxaBonus = tB;
    }
    
    public int getNVenderoes(){
        return this.nVend;
    }
    
    public int getNGerentes(){
        return this.nGere;
    }
    
    public void exibirFuncionarios(){
        System.out.println("GERENTES:");
        for(int i=0;i<this.getNGerentes();i++){
            this.gerente[i].exibirInformacoes();
        }
        System.out.println("VENDEDORES:");
        for(int i=0;i<this.getNVenderoes();i++){
            this.vendedor[i].exibirInformacoes();
        }
    }
    
    Vendedor getVendedor(int i){
        return this.vendedor[i];
    }
    
    Gerente getGerente(int i){
        return this.gerente[i];
    }
    
}

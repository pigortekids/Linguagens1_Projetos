package aula03;

public class Conta {
    // atributos
    private int numero;
    private double saldo;
    private Cliente titular;
<<<<<<< HEAD
    private static int totalDeContas = 0;
    
    //construtor
    public Conta(String nomeInicial, String sobrenomeInicial, String cpfInicial, double saldoInicial){
        this.saldo = saldoInicial;
        titular = new Cliente(nomeInicial, sobrenomeInicial, cpfInicial);
        Conta.totalDeContas += 1;
=======
    
    //métodos
    public Conta(double saldoInicial, String nomeInicial, String sobrenomeInicial, String cpfInicial){
        this.saldo = saldoInicial;
        titular = new Cliente(nomeInicial, sobrenomeInicial, cpfInicial);
>>>>>>> e05fb3ccb16b906f47096da1d71dab1bafd154f4
    }
    
    //métodos
    public void vizualizarSaldo(){
        System.out.println("Saldo -> R$" + this.saldo);
    }
    
<<<<<<< HEAD
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    
    public void setNome(String nome1){
        this.titular.setNome(nome1);
    }
    
    public String getNome(){
        return this.titular.getNome();
    }
    
=======
>>>>>>> e05fb3ccb16b906f47096da1d71dab1bafd154f4
    public void mostrarTudo(){
        this.titular.mostrar();
    }
    
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
        }
        else{
            System.out.println("valor errado digitado");
        }
    }
    
    public boolean sacar(double valor){
        if(this.saldo - valor < 0){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    
    public void transferirPara(Conta conta1, double valor){
        if(this.sacar(valor)){
            conta1.depositar(valor);
        }
        else{
            System.out.println("Sem dinheiro suficiente para transferir");
        }
    }
                
}

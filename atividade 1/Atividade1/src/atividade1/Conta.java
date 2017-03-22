// Igor Amaral Correa 15.00588-7
// Rodrigo Franciozi Rodrigues da Silva 14.04014-0

package atividade1;

public class Conta {
    // atributos
    private String agencia;
    private String cc;
    private double limite;
    private Cliente titular;
    private Dinheiro dinheiro;
    
    //métodos
    public Conta(double saldoInicial, String nomeInicial, String sobrenomeInicial, 
            String cpfInicial, char moedaInicial, double limiteInicial){
        limite = limiteInicial;
        titular = new Cliente(nomeInicial, sobrenomeInicial, cpfInicial);
        dinheiro = new Dinheiro(saldoInicial, moedaInicial);
    }
    
    public void vizualizarSaldo(){
        System.out.println("Saldo -> R$" + this.dinheiro.getSaldo());
    }
    
    public void mostrarTudo(){
        this.titular.mostrar();
    }
    
    public void depositar(double valor){
        double saldo1 = this.dinheiro.valorEmReal(valor);
        if(valor>0){
            saldo1 += valor;
            if(this.dinheiro.getMoeda() == 'e'){
                this.dinheiro.setSaldo(this.dinheiro.realParaEuro(saldo1));
            }
            else if(this.dinheiro.getMoeda() == 'd'){
                this.dinheiro.setSaldo(this.dinheiro.realParaDolar(saldo1));
            }
            else{
                this.dinheiro.setSaldo(saldo1);
            }
        }
        else{
            System.out.println("valor inválido digitado");
        }
    }
    
    public boolean sacar(double valor){
        double saldo1 = this.dinheiro.valorEmReal(this.dinheiro.getSaldo());
        double limite1 = this.dinheiro.valorEmReal(this.limite);
        if(valor <= saldo1 + limite1){
            saldo1 -= valor;
            if(this.dinheiro.getMoeda() == 'e'){
                this.dinheiro.setSaldo(this.dinheiro.realParaEuro(saldo1));
            }
            else if(this.dinheiro.getMoeda() == 'd'){
                this.dinheiro.setSaldo(this.dinheiro.realParaDolar(saldo1));
            }
            else{
                this.dinheiro.setSaldo(saldo1);
            }
            return true;
        }
        else{
            return false;
        }
    }
    
    public void transferirPara(Conta conta2, double valor){
        if(this.sacar(valor)){
            this.depositar(valor);
        }
        else{
            System.out.println("Sem dinheiro suficiente para transferir");
        }
    } 
    
    public void alterarNome(String nome){
        this.titular.setNome(nome);
    }
    
    public void alterarCPF(String cpf){
        this.titular.setCPF(cpf);
    }
    
    public void alterarSobrenome(String sobrenome){
        this.titular.setSobrenome(sobrenome);
    }
    
    public void alterarMoedaCorrenteDaConta(char aM){
        this.dinheiro.setMoeda(aM);
    }
    
    public void exibirSaldo(){
        System.out.println("Saldo --> " + this.dinheiro.getSaldo());
        System.out.println("Saldo + Limite --> " + (this.dinheiro.getSaldo() + limite));
        if (this.dinheiro.getSaldo() >= 0){
            System.out.println("Limite sendo usado --> 0");
        }
        else{
            System.out.println("Limite sendo usado --> " + (this.dinheiro.getSaldo() *(-1)));
        }
    }
    
    public void exibirTitular(){
        this.titular.mostrar();
    }
    
    public void exibirTodasInformacoesDaConta(){
        this.exibirTitular();
        this.exibirSaldo();
    }
    
    public char getMoeda(){
        return this.dinheiro.getMoeda();
    }
                
}

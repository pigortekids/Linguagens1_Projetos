// Igor Amaral Correa 15.00588-7
// Rodrigo Franciozi Rodrigues da Silva 14.04014-0
package atividade1;

public class Dinheiro {
    private double valor;
    private char moeda;
    private static double taxaEuroDolar;
    private static double taxaRealDolar;

    public Dinheiro(double valorInicial, char moedaInicial){
        this.valor = valorInicial;
        this.moeda = moedaInicial;
    }
    
    public double realParaDolar(double real){
        double dolar = real/3.08;
        return dolar;
    }

    public double dolarParaReal(double dolar){
        double real = dolar * 3.08;
        return real;
    }

    public double euroParaDolar(double euro){
        double dolar = euro / 0.9249;
        return dolar;
    }

    public double dolarParaEuro(double dolar){
        double euro = dolar * 0.9249;
        return euro;
    }

    public double valorEmReal(double valor1){
        double valor;
        if(this.getMoeda() == 'e'){
            valor = this.euroParaReal(valor1);
        }
        else if(this.getMoeda() == 'd'){
            valor = this.dolarParaReal(valor1);
        }
        else{
            valor = valor1;
        }
        return valor;
    }

    public double valorEmDolar(double valor1){
        double valor;
        if(this.getMoeda() == 'e'){
            valor = this.euroParaDolar(valor1);
        }
        else if(this.getMoeda() == 'r'){
            valor = this.realParaDolar(valor1);
        }
        else{
            valor = valor1;
        }
        return valor;
    }

    public double valorEmEuro(double valor1){
        double valor;
        if(this.getMoeda() == 'r'){
            valor = this.realParaEuro(valor1);
        }
        else if(this.getMoeda() == 'd'){
            valor = this.dolarParaEuro(valor1);
        }
        else{
            valor = valor1;
        }
        return valor;
    }

    public static double getTaxaRealDolar(){
        return Dinheiro.taxaRealDolar;
    }

    public static double getTaxaEuroDolar(){
        return Dinheiro.taxaEuroDolar;
    }

    public char getMoeda(){
        return this.moeda;
    }

    public void setMoeda(char m){
        this.moeda = m;
    }

    public void alterarTaxaRealDolar(double rD){
        this.taxaRealDolar = rD;
    }

    public void alterarTaxaEuroDolar(double eD){
        this.taxaEuroDolar = eD;
    }
    
    public double getSaldo(){
        return this.valor;
    }
    
    public void setSaldo(double saldo1){
        this.valor = saldo1;
    }
    
    
}
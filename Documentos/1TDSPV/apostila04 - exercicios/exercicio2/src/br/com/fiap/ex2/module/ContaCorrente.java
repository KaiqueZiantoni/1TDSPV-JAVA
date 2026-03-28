package br.com.fiap.ex2.module;

public class ContaCorrente {
    public double saldo = 0;
    public Cliente titular;


    public void depositar(double novoValor){
        saldo = saldo + novoValor;
    }
    
    public void retirar(double novovalor){
        saldo = saldo - novovalor;

    }
    
    public double retornarSaldo(){
        return saldo;
    }
}

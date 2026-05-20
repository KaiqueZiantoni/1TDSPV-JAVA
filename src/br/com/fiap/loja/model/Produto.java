package br.com.fiap.loja.model;

public class Produto {
    private int id;
    private double preco;
    private String nome;

    public Produto(int id, double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }


    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco=preco;
    }

    //Retorna preço do produto com desconto
    public double calcularDesconto(int porcentagem){
        return preco - (preco * porcentagem / 100) ;
    }

    //Retornar o preço do desconto de acordo com cupom
    //Fiap15 - 15% de desconto
    //Fiap30 - 30% de desconto

    public double calcularDesconto(String cupom) {
        double valorCupom = 0;
        if (cupom.equals("Fiap15")){
            valorCupom = preco- 15/100*preco;

        } else if (cupom.equals("Fiap30")) {
             valorCupom = preco- 30/100*preco;
        }
        return valorCupom;
    }
//--------------------------------------------------------------------------------------------------------







    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

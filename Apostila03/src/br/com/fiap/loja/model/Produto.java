package br.com.fiap.loja.model;

public class Produto {

    public double preco;
    public int quantidade;
    public String nome;
    public boolean garantia;
    public Categoria categoria;


    public double calcularDesconto(){
        //Calcular preço do produto, com 10% de desconto.
        double desconto = preco * 0.1;
        double valorComDesconto = preco - desconto;
        return valorComDesconto;
    }
    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }


    public double calcularDescontoQuantidade(int qtd){
        double valorFinal;
        if (qtd >=5 && qtd <10){
            valorFinal = preco *0.85;
        } else if (qtd >=10) {
            valorFinal = preco * 0.8;
        }else {
            valorFinal = preco * 0.9;
        }
        return valorFinal;
    }
}

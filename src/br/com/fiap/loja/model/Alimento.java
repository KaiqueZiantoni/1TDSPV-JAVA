package br.com.fiap.loja.model;

public class Alimento extends Produto{
    private String Validade;
    private boolean perecivel;


    public Alimento(int id, double preco, String nome) {
        super(id, preco, nome);
    }


    public String getValidade() {
        return Validade;
    }

    public void setValidade(String validade) {
        Validade = validade;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
}

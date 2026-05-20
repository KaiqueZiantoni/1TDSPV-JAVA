package br.com.fiap.loja.model;

public class Eletronico extends Produto{

    private boolean garantia;
    private String voltagem;


    public Eletronico(int id, double preco, String nome) {
        super(id, preco, nome);
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
}

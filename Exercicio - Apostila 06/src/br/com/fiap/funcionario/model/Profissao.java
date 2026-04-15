package br.com.fiap.funcionario.model;

public class Profissao {
    private String nome;


    Profissao(){

    }
    public Profissao(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

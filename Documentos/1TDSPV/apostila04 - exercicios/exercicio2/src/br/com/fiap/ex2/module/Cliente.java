package br.com.fiap.ex2.module;

public class Cliente {
    public String nome;
    public String cpf;
    public Endereco endereco;


    public String retornarDados(){
        return "Nome: " + nome +
                " Reside em  " + endereco.retornarEndereco() +
                " portador do CPF: "+ cpf;

    }
}

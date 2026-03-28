package br.com.fiap.ex2.module;

public class Endereco {
    public String logradouro;
    public short numero;
    public String complemento;
    public String cep;

    public String retornarEndereco(){
        return "Rua " + logradouro + " numero " + numero +
                " Complemento: " + complemento +
                " CEP: " +cep;
    }
}

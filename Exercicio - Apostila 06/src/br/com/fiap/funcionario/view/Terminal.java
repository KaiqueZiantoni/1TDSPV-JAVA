package br.com.fiap.funcionario.view;

import br.com.fiap.funcionario.model.Funcionario;
import br.com.fiap.funcionario.model.Profissao;

public class Terminal {
    public static void main(String[] args) {

        Profissao pintor = new Profissao("pintor");


        Funcionario claudio = new Funcionario(123);
        Funcionario claudia = new Funcionario(125, "Claudia");
        Funcionario Joao = new Funcionario(1266, "joao", new Profissao("Pintor"));
    }
}

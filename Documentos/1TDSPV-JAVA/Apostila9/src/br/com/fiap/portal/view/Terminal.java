package br.com.fiap.portal.view;

import br.com.fiap.portal.model.Aluno;
import br.com.fiap.portal.model.Endereco;

import javax.swing.*;

public class Terminal {
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome(JOptionPane.showInputDialog("Qual nome do aluno: "));
        aluno.setCurso(JOptionPane.showInputDialog("Curso matriculado: "));
        aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Qual Rm do aluno?")));
        aluno.setCpf(JOptionPane.showInputDialog("Digite o CPF: "));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite idade: ")));

        Endereco endereco = new Endereco();
        endereco.setNumero(JOptionPane.showInputDialog("Numero da residencia: "));
        endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro: "));

        aluno.setEndereco(endereco);

        System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade() + " CPF: " + aluno.getCpf());
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Logradouro: " +  aluno.getEndereco().getLogradouro() + ", Numero: " + aluno.getEndereco().getNumero());


    }

}

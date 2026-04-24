package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString {

    //variavel.equals(outra variavel) é igual variavel == outra variavel
    //o IgnoreCase ajuda a nao quebrar com letras maiusculas e minusculas.

    public static void main(String[] args) {
        String endereco = JOptionPane.showInputDialog("Digite o endereço: ");
        String endereco1= JOptionPane.showInputDialog("Digite o endereco: ");

        if (endereco1.equalsIgnoreCase(endereco)) {
            System.out.println("Os endereços são idênticos!");

            System.out.println(endereco.length());
        } else {
            System.out.println("Os endereços são diferentes!");
        }

        //recuperar o carcter da posição 3

        System.out.println(endereco.charAt(2));

        for (int i=0; i <endereco.length(); i++){
            System.out.println(endereco.charAt(i));
        }

    }
}

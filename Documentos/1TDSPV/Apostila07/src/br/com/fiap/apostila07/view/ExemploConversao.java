package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploConversao {

    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Digite um numero");
        int n1 = Integer.parseInt(numero1);

        String numero2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        int n2 = Integer.parseInt(numero2);

        JOptionPane.showMessageDialog(null, "A soma é : "  +  (n1+n2));
    }
}

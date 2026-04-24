package br.com.fiap.model.view;

import javax.swing.*;

public class TesteTamanho {

    public static void main(String[] args) {
            String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: ");
            double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da primeira pessoa: "));
            double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da primeira pessoa: "));

            String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa: ");
            double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da segunda pessoa: "));
            double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da segunda pessoa: "));


            if (peso1 > peso2){
                JOptionPane.showMessageDialog(null,"Peso do " + nome1 + " é maior que " + nome2);
            }
            else if (peso1 == peso2) {
                JOptionPane.showMessageDialog(null, "Ambos tem o mesmo peso");

            } else{
                JOptionPane.showMessageDialog(null, "Peso do " + nome2 + " é maior que " + nome1);
            }

            if (altura1 > altura2){
                JOptionPane.showMessageDialog(null,"Altura do " + nome1 + " é maior que " + nome2);
            }
            else if (altura1 == altura2) {
                JOptionPane.showMessageDialog(null, "Ambos tem a mesma altura");

            } else{
                JOptionPane.showMessageDialog(null, "Altura do " + nome2 + " é maior que " + nome1);
        }
    }
    }



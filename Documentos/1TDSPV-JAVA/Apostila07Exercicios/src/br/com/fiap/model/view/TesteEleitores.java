package br.com.fiap.model.view;

import javax.swing.*;

public class TesteEleitores {

    static void main(String[] args) {
        int idade;

        int obrigatorios = 0;
        for (int i =0 ; i<3 ; i++){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            if (idade < 16){
                JOptionPane.showMessageDialog(null, "Não eleitor, menor de 16 anos");
            } else if (idade >=18 && idade <=56) {
                JOptionPane.showMessageDialog(null,"Eleitor obrigatório");
                obrigatorios++;
            }else{
                JOptionPane.showMessageDialog(null, "Eleitor facultativo");
            }

        }JOptionPane.showMessageDialog(null, "O total de eleitores obrigatórios é de: " + obrigatorios);
    }
}
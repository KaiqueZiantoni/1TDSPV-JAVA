package br.com.fiap.lanhouse.view;

import br.com.fiap.lanhouse.model.Computador;

public class Terminal {
    public static void main(String[] args) {
        Computador pc = new Computador("Intel I7", 1,
                "RTX 5060", 512, false,
                12 );

        Computador pc2 = new Computador(1, "Intel I5");
    }

}

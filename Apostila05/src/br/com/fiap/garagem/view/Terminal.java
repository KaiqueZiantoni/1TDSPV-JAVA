package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.Carro;

public class Terminal {
    public static void main(String[] args) {

        Carro onix = new Carro();
        onix.setPlaca("ABC1234");
        onix.setHoraEntrada("13:00");
        onix.setHoraSaida("14:00");
        onix.setSetores('A');
        onix.setNumeroVaga(23);
        onix.setValor(13.00);
        onix.setPreferencial(true);

        System.out.println("Placa: " + onix.getPlaca());
        System.out.println("Hora de entrada: " + onix.getHoraEntrada());
        System.out.println("Hora de saida: " + onix.getHoraSaida());
        System.out.println("Setores: " + onix.getSetores());
        System.out.println("Numero de vagas: " + onix.getNumeroVaga());
        System.out.println("Valor: " + onix.getValor());
        System.out.println("Preferencial: " + onix.isPreferencial());
    }
}

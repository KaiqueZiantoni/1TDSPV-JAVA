package br.com.fiap.view;

import br.com.fiap.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo03 {

    static void main(String[] args) {
        //Criar uma lista de veiculos
        List <Veiculo> veiculos = new ArrayList<>();
        //Criar 3 veiculos
        Veiculo celta = new Veiculo("ABC123", 2012, "Celta");
        Veiculo Kadett = new Veiculo("DCC453", 2013, "Kadett");
        Veiculo Golf = new Veiculo("TYU778", 2020, "Golf");

        //Adicionar os 3 veiculos na lista
        veiculos.add(celta);
        veiculos.add(Kadett);
        veiculos.add(Golf);

        // Adicionar um veiculo na lista sem criar uma variavel
        veiculos.add(new Veiculo("AYU223", 2014, "Range Rover"));


        //Recuperar o segundo veiculo da lista e exibir os dados
        Veiculo segundoVeiculo = veiculos.get(1);
        System.out.println(segundoVeiculo);
        //Loop
        veiculos.forEach(carro -> {
            System.out.println("Modelo: " + carro.getModelo() +
                    "  Ano: " + carro.getAno() +
                    "  Placa: " + carro.getPlaca());
        });


    }
}

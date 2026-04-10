package br.com.fiap.exercicios.view;
import br.com.fiap.exercicios.model.Aviao;
import br.com.fiap.exercicios.model.Carro;
import br.com.fiap.exercicios.model.Cor;
import br.com.fiap.exercicios.model.Lancha;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Cor corAviao = new Cor();
        corAviao.alterarCor(0,0,0,"preto");

        Cor corCarro = new Cor();
        corCarro.alterarCor(0,0,0,"Vermelho");

        Cor corLancha = new Cor();
        corLancha.alterarCor(0,0,0,"Azul");


        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o ano de fabricação da lancha? : ");
        int lancha = leitor.nextInt();

        Aviao plane = new Aviao();
        plane.setCor(corAviao);
        plane.setAnoFabricacao(2026);
        plane.setComprimento(39);
        plane.setPrefixo("BA");
        plane.setQuantidadeTurbinas(4);
        plane.setModelo("Boing");

        //-------------------------------------------------------------
        Carro celta = new Carro();
        celta.setCor(corCarro);
        celta.setAnoFabricacao(2024);
        celta.setModelo("Celta");
        celta.setMotor(18);
        celta.setQuantidadeDeLugares(4);
        celta.setQuantidadeDePortas(4);

        //Aviao
        System.out.println("Modelo: " + plane.getModelo());
        System.out.println("Cor Aviao: " + plane.getCor().getNome());
        System.out.println("Ano de fabricação: " + plane.getAnoFabricacao());
        System.out.println("Comprimento: " +plane.getAnoFabricacao());
        System.out.println("Prefixo: " + plane.getPrefixo());


        System.out.println("----------------------------------------------------------");
        //Carro
        System.out.println("Ano de fabricação: " + celta.getAnoFabricacao());
        System.out.println("Cor caro: " + celta.getCor().getNome());
        System.out.println("Modelo: " + celta.getModelo());
        System.out.println("Moto: " + celta.getMotor());


        System.out.println(" ----------------------------------------------------------");
        //Lancha
        Lancha NX290 = new Lancha();
        NX290.setCor(corLancha);

        System.out.println("Cor da lancha: " + NX290.getCor().getNome());
        System.out.println("Ano da lancha: " + lancha);



    }
}

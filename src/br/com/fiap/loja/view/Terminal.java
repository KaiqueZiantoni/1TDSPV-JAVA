package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Eletronico;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Iphone 17", 8000, false);

        Scanner desconto = new Scanner(System.in);
        //.out.println("Digite o valor do desconto: ");
        //int porcentagem = desconto.nextInt();
        //double precoFinal = celular.calcularDesconto(porcentagem);
        //System.out.println(precoFinal);


        Eletronico pc = new Eletronico("Intel", 10000, false);
        System.out.println("Qual valor do cupom: ");
        String valorCupom = desconto.next() + desconto.nextLine();
        String apenasNumeros = valorCupom.replaceAll("[^0-9]", "");
        int valorFinal = Integer.parseInt(apenasNumeros);

        double precoFinal = pc.calcularDesconto(valorFinal);
        System.out.println(precoFinal);


}}

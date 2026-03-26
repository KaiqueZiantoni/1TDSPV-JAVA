package br.com.fiap.loja.view;
import br.com.fiap.loja.model.Loja;
import br.com.fiap.loja.model.Produtos;

import java.util.Scanner;

public class Terminal {

    public static void main() {

        Scanner loja = new Scanner(System.in);
        System.out.println("Qual o item que vocês busca?" );
        String nomeItem = loja.nextLine();

        System.out.println("Qual o endereço da loja? ");
        String endereco  = loja.nextLine();

        System.out.println("Qual o numero da rua que a loja se encontra? ");
        int numeroLoja = loja.nextInt();

        System.out.println("Qual o produto que voce busca?");
        String nome = loja.nextLine();

        System.out.println("O valor do produto?: ");
        double valor = loja.nextDouble();

        System.out.println("Qual a quantidade do produto? ");
        int quantidade = loja.nextInt();


        Loja unidade = new Loja();
        unidade.endereco = endereco;
        unidade.item = nomeItem;
        unidade.numeroRua = numeroLoja;

        //------------------------------------------------------------------


        Produtos itens = new Produtos();

        itens.nome = nome;
        itens.preco = valor;
        itens.quantidade = quantidade;

        unidade.produtos = itens;
        System.out.println(itens.nome);

        //-------------------------------------------------------------------

       // System.out.println("O item buscado foi: " + nomeItem);
        //System.out.println("O endereço da loja é: " + endereco);
        //System.out.println("O numero da loja é: " + numeroLoja);
        //System.out.println("O produto buscado foi? " + nome);
        //System.out.println("O preco do produto é: " + valor);
        //System.out.println("A quantidade do produto é: "+ quantidade);


    }
}

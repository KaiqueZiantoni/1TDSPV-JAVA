package br.com.fiap.loja.view;
import br.com.fiap.loja.model.Produto;
import java.util.Scanner;
import br.com.fiap.loja.model.Categoria;

public class Terminal {


    public static void main(String[] args) {
        Scanner item1 = new Scanner(System.in);

        System.out.println("Qual o nome do Produto? ");
        String nome = item1.next() + item1.nextLine();

        System.out.println("Qual o preço do produto? ");
        double valor = item1.nextDouble();

        System.out.println("Qual a quantidade do produto? ");
        int quantidade = item1.nextInt();

        System.out.println("Produto tem garantia? ");
        boolean garantia = item1.nextBoolean();

        //-----------------------------------------------------------------------------
        System.out.println("Qual a categoria do produto? ");
        String nomeCategoria = item1.next() + item1.nextLine();

        System.out.println("Qual a descrição da categoria? ");
        String descricaoCategoria = item1.next() + item1.nextLine();


        Produto item = new Produto();
        item.nome = nome;
        item.preco = valor;
        item.quantidade = quantidade;
        item.garantia = garantia;

        Categoria info = new Categoria();

        info.nome = nomeCategoria;
        info.descricao = descricaoCategoria;
        item.categoria = info;


        System.out.println("Nome do produto: " + item.nome);
        System.out.println("Preço do produto: " + item.preco);
        System.out.println("Quantidade do produto: " + item.quantidade);
        System.out.println("Tem garantia? " + item.garantia);
        System.out.println("Categoria: " + info.nome);
        System.out.println("Descrição do produto: " + info.descricao);


        double desconto = item.calcularDesconto();
        System.out.println("Valor promocional: R$" + desconto);


        System.out.println("Digite o valor do produto: ");
        double precoNovo = item1.nextDouble();

        item.alterarPreco(precoNovo);
        System.out.println("Novo preço: " + item.preco);


        System.out.println("quantos deseja comprar?: ");
        int qtd = item1.nextInt();
        double valorFinal = item.calcularDescontoQuantidade(qtd);
        System.out.println("Com a quantidade " + valorFinal);
    }
}

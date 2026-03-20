package br.com.fiap.loja.view;
import br.com.fiap.loja.loja.model.Produto;

//ler os dados do produto


public class Terminal {

    //criar main
    public static void main(String[] args) {
        Produto item1 = new Produto();

        //Criar o objeto produto
        item1.preco = 100.00;
        item1.quantidade = 10;
        item1.nome = "Camiseta Palmeiras";
        item1.garantia = true ;

        //Atribuir os valores ao objeto


        //Exibir os valores
        System.out.println("Preço: " + item1.preco );
        System.out.println("Quantidade em estoque: " + item1.quantidade);
        System.out.println("Nome do produto: " + item1.nome);
        System.out.println("Tem garantia: " + item1.garantia);


        System.out.println("______________________________________________________________");

        Produto item2 = new Produto();

        item2.preco = 150.00;
        item2.quantidade = 5;
        item2.nome = "Camiseta Santos";
        item2.garantia = false;

        System.out.println("Preço: " + item2.preco);
        System.out.println("Quantidade em estoque: " + item2.quantidade);
        System.out.println("Nome do produto: " + item2.nome);
        System.out.println("Tem garantia: " + item2.garantia);

        System.out.println("______________________________________________________________");

        Produto item3 = new Produto();
        item3.garantia= false;
        item3.nome = "Camisa do Flamengo";
        item3.preco = 55.00;
        item3.quantidade = 9;

        System.out.println("Preço: " + item3.preco);
        System.out.println("Quantidade em estoque: " + item3.quantidade);
        System.out.println("Nome do produto: " + item3.nome);
        System.out.println("Tem garantia: " + item3.garantia);

    }


}

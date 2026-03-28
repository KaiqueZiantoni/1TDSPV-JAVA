package br.com.fiap.ex2.view;
import br.com.fiap.ex2.module.Cliente;
import br.com.fiap.ex2.module.ContaCorrente;
import br.com.fiap.ex2.module.Endereco;

import java.net.http.WebSocket;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        //ContaCorrente
        System.out.println("Qual valor voce deseja depositar? ");
        double valorDepositado = valor.nextDouble();
        System.out.println("Qual valor você quer retirar? ");
        double valorRetirado = valor.nextDouble();

        //Cliente
        System.out.println("Nome do cliente: ");
        String nomeCliente = valor.next() + valor.nextLine();
        System.out.println("CPF do cliente: ");
        String cpf = valor.next() + valor.nextLine();

        //Endereço
        System.out.println("Digite o logradouro: ");
        String logradouro = valor.next() + valor.nextLine();

        System.out.println("Digite o numero do endereço: ");
        Short numero = valor.nextShort();

        System.out.println("Digite o complemento: ");
        String complemento = valor.next() + valor.nextLine();

        System.out.println("Qual o seu CEP? ");
        String cep = valor.next() + valor.nextLine();




        ContaCorrente conta = new ContaCorrente();
        //metodos
        conta.depositar(valorDepositado);
        conta.retirar(valorRetirado);
        double novoSalvo = conta.retornarSaldo();
        System.out.println("Seu saldo atual é: " + novoSalvo);

        Endereco endereco = new Endereco();
        endereco.logradouro =logradouro;
        endereco.numero = numero;
        endereco.complemento = complemento;
        endereco.cep = cep;

        String infoEndereco = endereco.retornarEndereco();
        System.out.println(infoEndereco);

        Cliente cliente = new Cliente();
        cliente.nome = nomeCliente;
        cliente.cpf=cpf;
        cliente.endereco = endereco;

        String dadosCliente = cliente.retornarDados();
        System.out.println("Informaçoes do cliente: " + dadosCliente);







    }
}

package br.com.fiap.exercicio01.view;
import br.com.fiap.exercico01.model.Aluno;
import java.util.Scanner;

public class Terminal {

    static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.println("Qual o nome do aluno? ");
        String nome = notas.next() + notas.nextLine();

        System.out.println("digite sua nota da CP1: ");
        double cp1 = notas.nextDouble();

        System.out.println("digite sua nota da CP 2: ");
        double cp2 = notas.nextDouble();

        System.out.println("digite sua nota do GS:  ");
        double gs = notas.nextDouble();

        System.out.println("digite sua nota da SPRINT 1: ");
        double sp1 = notas.nextDouble();

        System.out.println("digite sua nota da SPRINT 2: ");
        double sp2 = notas.nextDouble();


        Aluno aluno = new Aluno();
        aluno.nome = nome;
        aluno.cp1 = cp1;
        aluno.cp2=cp2;
        aluno.gs= gs;
        aluno.sprint1 = sp1;
        aluno.sprint2= sp2;



        double media = aluno.CalcularMedia();
        System.out.println("A média final do aluno : " +  aluno.nome + " é " + media);

    }
}

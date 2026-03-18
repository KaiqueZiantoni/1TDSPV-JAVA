import java.util.Scanner;

public class ExemploEntradaSaida {
    public static void main(String[] args) {

        //ler as notas do aluno e calcular a média FIAP
        Scanner leitor = new Scanner(System.in);
        System.out.println(("Digite o nome do aluno"));
        String nome = leitor.next() +  leitor.nextLine();//Le mais palavras


        //Declarar variaveis necesárias
        System.out.println("Digite a nota da CP1: ");
        double CP1 = leitor.nextDouble(); // Le um valor do tipo double do teclado
        System.out.println("Digite a nota da CP2: ");
        double CP2 = leitor.nextDouble();
        System.out.println("Digite a nota da GS: ");
        double GS = leitor.nextDouble();
        System.out.println("Digite a nota do Challenge1: ");
        double challenge1 = leitor.nextDouble();
        System.out.println("Digite a nota do Challenge2: ");
        double challenge2 = leitor.nextDouble();

        double mediaCPS = (CP1+CP2)/2;
        System.out.println("Média de CP: " + mediaCPS);

        double mediaChallenge = (challenge1+challenge2)/2;
        System.out.println("Média de challenges: " + mediaChallenge);

        double mediaCalculada= mediaCPS*0.2 + mediaChallenge*0.2 + GS*0.6;

        System.out.println("A média do aluno  "+ nome +" é " + mediaCalculada);
    }
}

public class ExemploAluno {

    //método main

    static void main(String[] args) {
        //criar um objeto do tipo aluno.
        //Classe + variavel = novo objeto
        Aluno estudante = new Aluno();

        //atribiur valores para todos os atributos do aluno.

        estudante.id = 123;
        estudante.matriculado= true;
        estudante.idade= 30;
        estudante.nome = "Kaique";
        estudante.turma= 'A';
        estudante.nomeCurso= "ADS";
        estudante.valorMensalidade= 2000;

        //Exibir os valores do atributo do objeto aluno.

        System.out.println("ID: "+ estudante.id);
        System.out.println("matriculado: "+ estudante.matriculado);
        System.out.println("Idade: "+ estudante.idade);
        System.out.println("nome: "+ estudante.nome);
        System.out.println("turma: "+ estudante.turma);
        System.out.println("Nome do curso: "+ estudante.nomeCurso);
        System.out.println("Valor da mensalidade: "+ estudante.valorMensalidade);

        //Novo objeto aluno, atribuir valores para duas propriedades, e exibir os valores:

        Aluno estudante2 = new Aluno();

        estudante2.nome = "Jóse";
        estudante2.idade = 22;
        estudante2.turma = 'B';
        estudante2.nomeCurso = "Farmácia";

        System.out.println("------------------------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("turma: " + estudante2.turma);
        System.out.println("Nome do Curso: " + estudante2.nomeCurso);

        Aluno estudante3 = new Aluno();

        estudante3.id = 223;
        estudante3.nome="Janderson";
        estudante3.nomeCurso="Psicologia";
        estudante3.valorMensalidade= 1200;

        System.out.println("---------------------------------------");

        System.out.println("Id do estudante é: " + estudante3.id);
        System.out.println("Nome do estudante é: " + estudante3.nome);


    }
}

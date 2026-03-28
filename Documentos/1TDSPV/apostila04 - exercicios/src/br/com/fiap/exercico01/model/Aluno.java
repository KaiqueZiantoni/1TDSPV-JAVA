package br.com.fiap.exercico01.model;

public class Aluno {
    public String nome;
    public double cp1, cp2, gs, sprint1, sprint2;

    public double CalcularMedia (){
        double mediaCp = (cp1 + cp2 ) /2;
        double mediaSprint = (sprint1 + sprint2) /2;
        double mediaFinal = mediaCp * 0.2 + mediaSprint * 0.2 + gs * 0.6;
        return mediaFinal;
    }
}

package br.com.fiap.lanhouse.model;

public class Computador {
    private String processsador;
    private int id;
    private String placaDeVideo;
    private double armazenamento;
    private boolean ssd;
    private int memoriaRam;



    //---------------------------------------------------------
    //Primeira regra pra construir um construtor no java:
    //1 - tem que ter o mesmo nome da classe
    //2- Não tem nada de retorno
    //3- Construtor serve pra obrigar a ter informações
    public Computador(int id, String processsador){
        this.processsador = processsador;
        this.id = id;
    }

    public Computador(String processsador, int id, String placaDeVideo,double armazenamento, boolean ssd, int memoriaRam){
        this(id, processsador);
        this.placaDeVideo = placaDeVideo;
        this.armazenamento = armazenamento;
        this.memoriaRam = memoriaRam;
        this.ssd = ssd;
    }


    //---------------------------------------------------------


    public String getProcesssador() {
        return processsador;
    }

    public void setProcesssador(String processsador) {
        this.processsador = processsador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}

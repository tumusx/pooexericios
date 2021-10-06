package Classes;

public class Time {
    int pontosGanhos;
    public Time(int pontosGanhos){
        this.pontosGanhos=pontosGanhos;
    }

    public boolean ganharPartida(int pontosGanhos){
        this.pontosGanhos = this.pontosGanhos+3;
        return true;
    }
    public boolean empatarPartida(int pontosGanhos){
        this.pontosGanhos = this.pontosGanhos+1;
        return true;
    }

    public  boolean perderPartida(int pontosGanhos){
        this.pontosGanhos = this.pontosGanhos +0;
        return true;
    }
    public int getPontosGanhos() {
        return pontosGanhos;
    }

    public void setPontosGanhos(int pontosGanhos) {
        this.pontosGanhos = pontosGanhos;
    }
    public void imprimirPontos(){
        System.out.println("Pontos atuais " + this.getPontosGanhos());
    }}


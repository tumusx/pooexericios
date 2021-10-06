package Testes;

import Classes.Time;

public class TesteTime {
    public static void main(String[] args){
        Time a = new Time(0);
        Time b = new Time(0);
        Time c = new Time(0);

        a.ganharPartida(a.getPontosGanhos());
        a.imprimirPontos();

        b.empatarPartida(b.getPontosGanhos());
        b.imprimirPontos();

        c.perderPartida(b.getPontosGanhos());
        c.imprimirPontos();
    }
}

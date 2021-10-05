package Testes;

import Classes.Lampada;

public class TesteLampada {
    public static void main(String[] args){
        Lampada a = new Lampada(1);
        Lampada b = new Lampada(0);
        a.desligar(0);
        a.imprimir();
    }

    }

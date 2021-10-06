package Testes;

import Classes.Lampada;

public class TesteLampada {
    public static void main(String[] args){
        Lampada ligado =  new Lampada(1);
        Lampada desligado = new Lampada(0 );
        ligado.mostrarEstado();
        desligado.mostrarEstado();
    }

    }
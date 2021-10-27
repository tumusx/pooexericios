package Testes;

import Classes.Lampada;

import java.util.ArrayList;
import java.util.List;

public class TesteAula {
    public static void main(String[] args){
        Lampada a1 = new Lampada(5 );
        Lampada a2 = new Lampada(7);
         List luminaria = new ArrayList<>();

         luminaria.add(a1);
        System.out.println("qntd de lampadas " + luminaria.size());
    }
}

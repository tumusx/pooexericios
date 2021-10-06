package Testes;

import Classes.Carro;

public class TesteCarro {
    public static void main(String[] args){
        Carro a = new Carro(10);
        Carro b = new Carro(20);

        a.acelerar(a.getVelocidade());
        a.imprimirVelocidade();

        b.freiar(b.getVelocidade());
        b.imprimirVelocidade();

    }

}

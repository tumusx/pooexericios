package Testes;

import Classes.Relogio;

public class TesteRelogio {
    public static void main(String[] args) {
        Relogio a = new Relogio(0);
        Relogio b = new Relogio(0);
        a.adicionarHora();
        b.subtraiHora();
    }
}

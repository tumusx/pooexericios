package Testes;

import Classes.Telefone;

public class TesteTelefone {
    public static void main(String[] args) {
        Telefone a = new Telefone(2,5.6);
        Telefone b = new Telefone(1, 4.3);
        a.duracaoLigacao(a.getNumMinutos());
        b.mostrarConta();
    }
}

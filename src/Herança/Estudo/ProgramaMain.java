package Herança.Estudo;

import java.text.ParseException;

public class ProgramaMain {
    public static void main(String[] args) throws ParseException {
        Pessoa pessoa = new Pessoa("Joao", "21/12/2001");
        Professor prof1 = new Professor("Marlos", "25/10/2021", "Informática");

        System.out.println(pessoa.toString());
        System.out.println(prof1.toString());

    }
}

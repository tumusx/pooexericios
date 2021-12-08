package Herança.Estudo;

import java.text.ParseException;

public class Professor extends Pessoa {
    private String departamento;
    public Professor(String nome, String data, String departamento ) throws ParseException {
        super(nome, data);
        this.departamento     = departamento;

    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +  ", dataNascimento='" + dataNascimento + '\'' +  ", departamento='" + departamento + '\'' +  '}';
    }
}

package Herança.Estudo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.SimpleTimeZone;

public class Pessoa {
    protected String nome;
    protected Date dataNascimento;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa(String nome, String data) throws ParseException {
        this.nome = nome;
        this.dataNascimento = (Date) format.parse(data);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(dataNascimento, pessoa.dataNascimento) && Objects.equals(format, pessoa.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento, format);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dataNascimento=" + format.format(dataNascimento) + '}';
    }
}

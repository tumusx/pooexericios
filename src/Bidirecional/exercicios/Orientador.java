package Bidirecional.exercicios;

import Bidirecional.Turma;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;


public class Orientador {
    private String nomeOrientador;
    private Aluno aluno;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public Orientador(String nome) {
        this.nomeOrientador = nome;
    }

    public String getNome() {
        return nomeOrientador;
    }

    public void setNome(String nome) {
        this.nomeOrientador = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Orientador other = (Orientador) obj;
        if (nomeOrientador == null) {
            if (other.nomeOrientador != null)
                return false;
        } else if (!nomeOrientador.equals(other.nomeOrientador))
            return false;
        return true;
    }

    public boolean addAluno(Aluno aluno) {
        boolean retorno = false;
        if (aluno != null && !listaAlunos.contains(aluno)) {
            listaAlunos.add(aluno);
            retorno = true;
            aluno.addOrientador(this);
        }
        return retorno;
    }

    public boolean removerAluno(Aluno aluno) {
        boolean retorno = false;
        if (aluno != null && listaAlunos.contains(aluno) && listaAlunos.size() > 3) {
            listaAlunos.remove(aluno);
            retorno = true;
            aluno.removeOrientadorAluno(this);
        }
        return retorno;
    }



    @Override
    public int hashCode() {
        final  int prime = 31;
        int result = 1;
        result = prime * result + ((nomeOrientador == null) ? 0 : nomeOrientador.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Orientador: " +
                "" + nomeOrientador +  "\'";
    }
}


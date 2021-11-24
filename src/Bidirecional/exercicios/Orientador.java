package Bidirecional.exercicios;

import Bidirecional.Turma;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;


public class Orientador {
    private String nome;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public Orientador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public boolean addAluno(Aluno aluno) {
        if (aluno != null && !listaAlunos.contains(aluno)) {
            listaAlunos.add(aluno);
            aluno.addOrientador(this);
            return true;
        }
        return false;
    }

    public boolean removerAluno(Aluno aluno) {
        if (aluno != null && listaAlunos.contains(aluno) && listaAlunos.size() > 3) {
            listaAlunos.remove(aluno);
            aluno.removeOrientadorAluno(this);
            return true;
        }
        return false;
    }



    @Override
    public int hashCode() {
        final  int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Orientador:" +
                "nome='" + nome + '\''  +
                ':';
    }
}


package Bidirecional.exercicios;

import Bidirecional.Turma;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private String nome;

    private List<Orientador> listorientador = new ArrayList<>();
    public List<Orientador> getOrientador() {
        return listorientador;
    }

    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public boolean addOrientador(Orientador orientador) {
        if (orientador != null && !listorientador.contains(orientador)) {
            listorientador.add(orientador);
            orientador.addAluno(this);
            return true;
        }
        return false;
    }
    public boolean removeOrientadorAluno(Orientador orientador){
        if (orientador != null && listorientador.contains(orientador) && listorientador.size() > 2) {
            listorientador.remove(orientador);
            orientador.removerAluno(this);
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }
    public String toString(){
        return "Aluno: " + nome + " - Matricula: " + matricula + " : " ;
    }
}


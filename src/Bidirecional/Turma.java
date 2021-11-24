package Bidirecional;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String codigo;

    public List<Aluno> getListaAlunos() {
        return ListaAlunos;
    }

    private List<Aluno> ListaAlunos = new ArrayList<>();

    public Turma(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
@Override
public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turma other = (Turma) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public boolean adicionaAluno(Aluno aluno){
        if (aluno != null && !ListaAlunos.contains(aluno) ) {
            ListaAlunos.add(aluno);
            //Aqui vai pegar o aluno e vai add o aluno na lista de alunos
            aluno.adicionaTurma(this);
            return true;
        }
        return false;
    }
    public boolean removerAluno(Aluno aluno){
        if (aluno != null && ListaAlunos.contains(aluno)) {
            ListaAlunos.remove(aluno);
            //Aqui vai pegar o aluno e vai remover  o aluno na lista de alunos
            aluno.removerTurma(this);
        return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    public String toString(){
        return "Turma: " + nome + " - " + codigo + this.nome + this.getListaAlunos();
    }
}

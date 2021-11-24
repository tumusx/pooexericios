package Bidirecional;

import java.util.ArrayList;
import java.util.List;

public class Aluno<result, prime> {
    private String matricula;
    private String nome;

    public List<Turma> getListaTurmas() {
        return ListaTurmas;
    }

    private List<Turma> ListaTurmas = new ArrayList<>();

//Criar collections para gerar o hash code e icons para o obejto
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
 @Override
    public String toString(){
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public boolean adicionaTurma(Turma turma){
        if (turma != null && !ListaTurmas.contains(turma)) {
            ListaTurmas.add(turma);
            turma.adicionaAluno(this);
        return true;
        }
        return false;
    }
    public boolean removerTurma(Turma turma){ 
        if (turma != null && ListaTurmas.contains(turma) && getListaTurmas().size() > 0) {
            ListaTurmas.remove(turma);
            turma.removerAluno(this);
            return true;
        }
        return false;
    }

}

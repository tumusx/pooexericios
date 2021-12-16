package ManipulaçãodeExecções.atividadesExecption;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudante {
    List<Orientador> listaOrientador = new ArrayList<>();

    private int matricula;


    public Estudante(int matricula){
        this.matricula= matricula;
    }

    public void addEstudante(int quantidade) throws LimiteEstudantesExeption{
        if(listaOrientador.size() < quantidade){

        } else {
            throw new LimiteEstudantesExeption("Limite de orientador atingido");
        }
    }

    public boolean adicionarOrientador(Orientador orientador){
            boolean sucesso = false;
            if(orientador!= null && !listaOrientador.contains(orientador)&& listaOrientador.size()<=2){
                listaOrientador.add(orientador);
                sucesso = true;
                if(!orientador.listaEstudantes.contains(this)){
                    orientador.adicionarAluno(this);
                }
            }
            return sucesso;
        }


    public boolean removerOrientador(Orientador orientador){
        boolean sucesso = false;
        if(listaOrientador.isEmpty()  && listaOrientador.contains(orientador) ){
            listaOrientador.remove(orientador);
            sucesso = true;
                orientador.removerAluno(this);
        }
        return sucesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudante)) return false;
        Estudante estudante = (Estudante) o;
        return matricula == estudante.matricula && listaOrientador.equals(estudante.listaOrientador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaOrientador, matricula);
    }

    public List<Orientador> getListaOrientador() {
        return listaOrientador;
    }

    public void setListaOrientador(List<Orientador> listaOrientador) {
        this.listaOrientador = listaOrientador;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "listaOrientador=" + listaOrientador +
                ", matricula=" + matricula +
                '}';
    }

}

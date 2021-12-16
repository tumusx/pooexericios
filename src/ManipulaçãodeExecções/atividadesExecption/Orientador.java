package ManipulaçãodeExecções.atividadesExecption;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orientador {
    List <Estudante> listaEstudantes = new ArrayList<>();


    private String nome;

    public Orientador(String s){
        this.nome = nome;
    }


    public boolean adicionarAluno(Estudante estudante, int quantidade)throws LimiteOrientadorExecption {
        if (listaEstudantes.size() < quantidade) {

        } else {
            throw new LimiteOrientadorExecption("Limite de estudantes atingido");
        }
        {
            boolean sucesso = false;
            if (estudante != null && !listaEstudantes.contains(estudante) && listaEstudantes.size() <= 3) {
                listaEstudantes.add(estudante);
                sucesso = true;
                if (!estudante.listaOrientador.contains(this)) {
                    estudante.adicionarOrientador(this);
                }

            }
            return sucesso;
        }
    }
    public boolean removerAluno(Estudante estudante){
        boolean sucesso = false;
        if(listaEstudantes.isEmpty()  && listaEstudantes.contains(estudante) ){
            listaEstudantes.remove(estudante);
            sucesso = true;
                estudante.removerOrientador(this);
            }

        return sucesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orientador)) return false;
        Orientador that = (Orientador) o;
        return listaEstudantes.equals(that.listaEstudantes) && nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaEstudantes, nome);
    }

    public List<Estudante> getListaEstudantes() {
        return listaEstudantes;
    }

    public void setListaEstudantes(List<Estudante> listaEstudantes) {
        this.listaEstudantes = listaEstudantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Orientador{" +nome+
                "listaEstudantes=" + listaEstudantes +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void imprimirOrientadorEstudante(){
        System.out.println();
        System.out.println(this.toString());
        for (Estudante oEstudante : this.getListaEstudantes()){
            System.out.println("---"+ oEstudante.toString());
        }

    }

    public void adicionarAluno(Estudante estudante) {
    }
}



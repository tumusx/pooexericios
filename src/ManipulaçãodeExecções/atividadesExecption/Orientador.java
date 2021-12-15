package ManipulaçãodeExecções.atividadesExecption;

import java.util.ArrayList;
import java.util.List;

public class Orientador {
    List <Estudante> listaEstudantes = new ArrayList<>();


    private String nome;

    public Orientador(){
        this.nome = nome;
    }

    public boolean adicionarAluno(Estudante estudante){
        boolean sucesso = false;
        if(estudante!= null && !listaEstudantes.contains(estudante)){
            listaEstudantes.add(estudante);
            sucesso = true;
            if(!estudante.listaOrientador.contains(this)){
                estudante.adicionarOrientador(this);
            }

        }
        return sucesso;
    }

    public boolean removerAluno(){
        return true;
    }


}

package ManipulaçãodeExecções.atividadesExecption;

import java.util.ArrayList;
import java.util.List;

public class LimiteOrientadorExecption extends Exception {
    private static final long serialVersionUID = 1L;
    List<Estudante> listaEstudante = new ArrayList<>();

    public  LimiteOrientadorExecption(String estudante ){
        if (listaEstudante.size() >= 10){
            System.out.println("Limite de estudante atingido" + estudante);
        }
    }

}

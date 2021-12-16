package ManipulaçãodeExecções.atividadesExecption;

import java.util.ArrayList;
import java.util.List;

public class LimiteEstudantesExeption extends Exception {
    List<Orientador> listaOrientador = new ArrayList<>();

    private static final long serialVersionUID = 1L;

    public  LimiteEstudantesExeption(String orientador ){
        if (listaOrientador.size() >= 10){
            System.out.println("Limite de estudantes atingido" + orientador);
        }
    }
}

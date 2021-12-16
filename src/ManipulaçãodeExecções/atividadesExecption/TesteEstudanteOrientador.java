package ManipulaçãodeExecções.atividadesExecption;

public class TesteEstudanteOrientador {
    public static void main(String[] args) {
        Orientador o1 = new Orientador("Joao Paulo");
        Orientador o2 = new Orientador("Pedro Queiroz");

        Estudante e1 = new Estudante(45210);
        Estudante e2 = new Estudante(45421);

        try {
        o1.adicionarAluno(e1);
        o1.adicionarAluno(e1);
        e2.adicionarOrientador(o2);
        o1.removerAluno(e1);
        e2.adicionarOrientador(o1);

        o1.imprimirOrientadorEstudante();
        o2.imprimirOrientadorEstudante();
    }catch (RuntimeException e){
        System.out.println(e.getMessage());
        }
}}

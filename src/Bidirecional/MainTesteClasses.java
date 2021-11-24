package Bidirecional;

public class MainTesteClasses {

    public static void main(String[] args) {

    Aluno a = new Aluno("20214", "Joao Carlos");
    Aluno b = new Aluno("21564", "Jose Carlos");
    Aluno c = new Aluno("21564", "Thiago Alfred");
    Turma t = new Turma("Programacao", "21");
    Turma t2 = new Turma("Redes de Computadores", "365");
    Turma t3 = new Turma("Aliare Turma", "698");

    a.adicionaTurma(t3);
    a.removerTurma(t);
    a.adicionaTurma(t2);
    t.adicionaAluno(a);
    t.removerAluno(a);
    t3.adicionaAluno(c);
    a.removerTurma(t3);
    t.adicionaAluno(b);
    t.removerAluno(b);


   /* System.out.println(t.toString());
    System.out.println(t2.toString());
    System.out.println(t3.toString());*/


       System.out.println(a);
        System.out.println(t);
        System.out.println(b);
        System.out.println(t2);
        System.out.println(t3);
    }
}

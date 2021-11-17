package Revisão.exe2;

public class MainTest {
    //tetst
    public static void main(String[] args) {
        Livro a1 = new Livro(5,"Pe de Feijao");
        Livro a2 = new Livro(6,"Pe de Arroz com Fava");
        System.out.println(a1);
        System.out.println(a2);



        Aluno b1 = new Aluno("650420","Alberto");
        System.out.println(b1);

        Emprestimo e1 = new Emprestimo(b1,a1,5);
        System.out.println(e1.toString());

    }
}

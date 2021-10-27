package Agregação;

public class TesteAutor {
    public static void main(String[] args){
        Autor c;
        Livro a1 = new Livro("Joao");
        Livro a2 = new Livro("Carlos");
        Livro a3 = null;

        try {
            c = new Autor("Ouro", a3);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        c = new Autor("Platinum", a1);
        c.addLivro(a2);
        System.out.println(c);

        c.removerLivro(a1);
        System.out.println(c);
    }
}

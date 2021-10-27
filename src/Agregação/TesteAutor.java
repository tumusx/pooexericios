package Agregação;

public class TesteAutor {
    public static void main(String[] args){
        Autor c;
        Autor a = null;
        Livro a1 = new Livro("Joao");
        Livro a2 = new Livro("Carlos");
        Livro returnMetodo = new Livro(5);
        Livro a3 = null;

        try {
            c = new Autor("", a3);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        c = new Autor("", a1);
        c.addLivro(a2);
        System.out.println(c);

        final var b = a.addcnpjAutor(returnMetodo);
        System.out.println(a);

        c.removerLivro(a1);
        System.out.println(c);
    }
}

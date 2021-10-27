package Agregação;

public class Livro {
    private String nomeAutor;

    public Livro(String nomeAutor) {
        this.nomeAutor = nomeAutor;

    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nomeAutor == null) {
            if (other.nomeAutor != null)
                return false;
        } else if (!nomeAutor.equals(other.nomeAutor))
                return false;
            return true;
        }
        @Override
        public String toString () {
            return "Autor[autor=" + nomeAutor + "]";
        }
    }



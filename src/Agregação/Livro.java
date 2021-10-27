package Agregação;

public class Livro {
    private String nomeAutor;
    private int cnpj;

    public Livro(String nomeAutor) {
        this.nomeAutor = nomeAutor;

    }
    public Livro (int cnpj){
        this.cnpj=cnpj;
    }


    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getCnpj() {
        return cnpj;
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


    public boolean quals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (cnpj == Integer.parseInt(null)) {
                return false;
        } else if (cnpj == (other.cnpj))
            return false;
        return true;
    }
    public String toStringF () {
        return "cnpj[cnpj=" + cnpj + "]";
    }
    }



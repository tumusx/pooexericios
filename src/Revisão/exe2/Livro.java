package Revisão.exe2;

public class Livro {
    private float codigo;
    private String titulo;

    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return (int) codigo;
    }

    public void setCodigo(int codigo) {
         this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
         this.titulo = titulo;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
         Livro other = (Livro) obj;
        if (codigo == Float.parseFloat(null)) {
            if ((other.codigo))
        }
        return true;
    }
    @Override
    public int hashCode() {
       final int prime = 31;
       int result = 1;
        result = prime* result+ ((codigo == null)?0: codigo.hashCode());
       result = prime* result+ ((titulo == null)?0: titulo.hashCode());
       return result;
    }

}

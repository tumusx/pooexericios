package Revisão.exe2;

import com.sun.source.tree.ReturnTree;

public class Livro {
    private int codigo;
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
            if (other.codigo  != Float.parseFloat(null)) {
                return false;
            } else if(!codigo(other.codigo)) {
                return false;
        }
            if (titulo == null) {
            if(other.titulo != null) {
                return false;
            }
            else if(!titulo.equals(other.titulo)) {
                return false;
            }
    }


}
        return true;
    }

    private boolean codigo(int codigo) {
        return codigo == this.codigo;
    }
    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", titulo=" + titulo + '}';
    }
}

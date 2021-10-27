package Agregação;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Autor {
    private String idAutor;
    private List<Livro>ListaLivro = new ArrayList<Livro>();
            public Autor (String idAutor, Livro livro){
                if(livro == null){
                    throw new NullPointerException("Nao pode ficar vazio");

                }
                this.idAutor = idAutor;
                this.addLivro(livro);

            }
            public boolean addLivro(Livro newLivro){
                boolean livroIncorreto = false;
                if(newLivro!=null){
                    ListaLivro.add(newLivro);
                    livroIncorreto = true;
                }
                return livroIncorreto;
    }
    public boolean removerLivro(Livro removeLivro){
                boolean livroCorreto = false;
                if(ListaLivro.size()>1 &&ListaLivro.contains(removeLivro)){
                    ListaLivro.remove(removeLivro);
                    livroCorreto = true;
                    }
                return livroCorreto;
                }
    public String getIdAutor() {
        return idAutor;
    }
    public List<Livro>getListaLivro(){
                List<Livro>listaRetorn = new ArrayList<Livro>();
                listaRetorn.addAll(ListaLivro);
                return listaRetorn;
    }
    @Override
    public String toString(){
                return "Livro[idAutor=" +idAutor+", ListaLivro="+ListaLivro+"]";
    }
    }


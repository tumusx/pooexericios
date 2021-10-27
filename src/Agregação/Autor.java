package Agregação;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Autor {
    private String idAutor;
    private String cnpjAutor;
    private List<Livro>ListaLivro = new ArrayList<Livro>();
            public Autor (String idAutor, String cnpjAutor, Livro livro) {
                if (livro == null) {
                    throw new NullPointerException("Nao pode ficar vazio");

                }
                this.cnpjAutor = cnpjAutor;
                this.addLivro(livro);
                this.idAutor = idAutor;
                this.addLivro(livro);

            }

    public Autor(String platinum, Livro a1) {

    }

    public boolean addLivro(Livro newLivro){
                boolean livroIncorreto = false;
                if(newLivro!=null){
                    ListaLivro.add(newLivro);
                    livroIncorreto = true;
                }
                return livroIncorreto;
    }
    public boolean addcnpjAutor(Livro newcnpj){
        boolean cnpj = false;
        if(newcnpj!=null){
            ListaLivro.add(newcnpj);
            cnpj = true;
        }
        return cnpj;
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


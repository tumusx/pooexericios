package Revisão.exe1.Agregação;

public class Item {
    private int quantidade;
    private Produto produto;

    public  Item(int quantidade){
        this.quantidade = quantidade;
    }
    public boolean addproduto(Produto produto){
        boolean retorno = false;
        if(this.produto == null){
            this.produto = produto;
            retorno = true;
        }
        return retorno;
    }
    // se o cliente desistiu da compra, ele tem a opção de fazer com que o produto seja removido
    public  boolean excluirproduto(Produto produto2){
        boolean retorno = false;
        if(this.produto != null){
            this.produto = null;
            retorno = true;
        }
        return retorno;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    @Override
    public String toString() {
        return "Item:" +
                "quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }

}

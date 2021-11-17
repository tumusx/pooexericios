package Revisão.exe1.Agregação;

public class Produto {
    private  float valor;
    private int codigo;
    private String descricao;

    public Produto (int codigo, float valor, String descricao){
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;

    }
    public int getCodigo(){
        return codigo;
    }

    public  float getValor(){
        return valor;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + " Valor: " + valor + " Descrição: " + descricao;
    }

}

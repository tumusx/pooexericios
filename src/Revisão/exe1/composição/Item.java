package Revisão.exe1.composição;

import Revisão.exe1.Agregação.Produto;

public class Item {
    private int quantidade;

    public Item(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
   @Override
    public String toString() {
        return "Item" +
                "quantidade=" + quantidade +
                '}';
    }


}

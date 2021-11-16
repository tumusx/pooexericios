package Revisão.exe1.composição;

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

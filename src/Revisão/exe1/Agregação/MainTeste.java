package Revisão.exe1.Agregação;

public class MainTeste {
    public static void main(String[] args) {
        Item item1 = new Item(10);
        Produto produto1 = new Produto(10, 2, "Feijão");
        Produto produto2 = new Produto(20, 3, "Arroz");

        item1.addproduto(produto1);
        System.out.println(item1);

        item1.excluirproduto(produto2);
        System.out.println(item1);
    }
}

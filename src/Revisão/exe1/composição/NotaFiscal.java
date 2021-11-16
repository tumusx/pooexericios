package Revisão.exe1.composição;

public class NotaFiscal {
    private float valor_total;
    private Item item;


    public NotaFiscal(float valor_total) {
        this.valor_total = valor_total;
        this.item = new Item((int) valor_total);
    }
    public  boolean add_Item(Item item){
        boolean sucesso = false;
        if(this.item==null){
            this.item = item;
            sucesso = true;
        }
        return sucesso;
    }
    public boolean total_notaFiscal(float valor_total){
        this.item = new Item((int) valor_total);
        return true;
    }

    public float getValor_total() {
        return valor_total;
    }

    public Item getItem() {
        return item;
    }
    @Override
    public String toString() {
        return "NotaFiscal{" +
                "valor_total=" + valor_total +
                ", item=" + item +
                '}';
    }
}

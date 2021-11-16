package Revisão.exe1.composição;

public class TesteMain {
    public static void main(String[] args) {
        NotaFiscal a = new NotaFiscal(100.0F);
        a.total_notaFiscal(200.0F);
        System.out.println(a.toString());
    }
}

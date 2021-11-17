package Revisão.exe3;

public class MainTeste {
    public static void main(String[] args) {
        Conta conta = new Conta(5, "521");
        CaixaEletronico caixa = new CaixaEletronico("Banco Brasil Caixa Estrada");
        System.out.println(caixa);
        caixa.estaAberto("Conta ABilio");
        caixa.sacar("100");
        System.out.println(caixa);
    }
}

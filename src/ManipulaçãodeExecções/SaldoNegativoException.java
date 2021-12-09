package ManipulaçãodeExecções;

public class SaldoNegativoException extends Exception {
    private static final long serialVersionUID = 1L;
    public SaldoNegativoException(String numeroConta) {
        super("Saldo negativo para a conta " + numeroConta);

    }
}

package ManipulaçãodeExecções;

import java.util.Objects;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo)   {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor)   throws SaldoNegativoException{

        if (saldo<=valor){
            saldo = saldo-valor;
        }else {
            throw new SaldoNegativoException(this.numero);

        }
        this.saldo += valor;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public String getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return Double.compare(conta.getSaldo(), getSaldo()) == 0 && getNumero().equals(conta.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero(), getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}

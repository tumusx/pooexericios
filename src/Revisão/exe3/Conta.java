package Revisão.exe3;

public class Conta {
    private int agencia;
    private String numero;
    private int saldo;

    public Conta(int agencia, String numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 50;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }
    @Override
    public String toString(){
        return "Conta: " + this.getAgencia() + "-" + this.getNumero() + " Saldo: " + this.getSaldo();
    }
}


package Revisão.exe3;

public class CaixaEletronico {
    private String nome;
    private boolean estaAberto;
    private boolean temCartao;

    public CaixaEletronico(String nome) {
        this.nome = nome;
    }
    public void estaAberto(String conta) {
        if (conta==null) {
            System.out.println("Não está aberto");
        }
        else {
            System.out.println("Va em outra agencia");
            this.estaAberto = true;
        }
    }
    public void sacar(String valor) {
        if (valor==null) {
            System.out.println("Não tem saldo");
        }
        else {
            System.out.println("Saque realizado");
        }
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "CaixaEletronico{" + "nome=" + nome + ", estaAberto=" + estaAberto + ", temCartao=" + temCartao + '}';
    }

}

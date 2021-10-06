package Classes;

public class Telefone {
    int numMinutos;
    double preco;
    public Telefone(int numMinutos, double preco){
        this.numMinutos=numMinutos;
        this.preco=preco;
    }

    public boolean duracaoLigacao(int numMinutos){
        this.numMinutos=this.numMinutos+6;
        return true;
    }
    public boolean alterarPreco(double p){
        return true;
    }

    public boolean mostrarConta(int numMinutos, double preco){
        System.out.println("soma"+ numMinutos*preco);
        return true;
    }
    public int getNumMinutos() {
        return numMinutos;
    }

    public void setNumMinutos(int numMinutos) {
        this.numMinutos = numMinutos;
    }
    public void imprimir(){
        System.out.println("a");
    }


    public void mostrarConta() {
    }
}

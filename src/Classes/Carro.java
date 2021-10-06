package Classes;
public class Carro {
    double velocidade;

    public Carro(double velocidade){
        this.velocidade = velocidade;
    }

    public boolean acelerar(double velocidade){
        this.velocidade = this.velocidade+10;
        return true;
    }
    public boolean freiar(double velocidade){
        this.velocidade = this.velocidade-10;
        return true;
    }

    public boolean mostrarVelocidade(double velocidade){
        return freiar(getVelocidade());
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public void imprimirVelocidade(){
        System.out.println("velocidade " + this.getVelocidade());
    }

}


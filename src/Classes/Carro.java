package Classes;
public class Carro {
    double velocidade = 10.5;

    public Carro(double velocidade){
        this.velocidade = velocidade;
    }

    public double acelerar(double velocidade){
        return velocidade + 10;
    }
    public double  freiar(double velocidade){
        return velocidade-10;
    }

    public double mostrarVelocidade(double velocidade){
        return velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}


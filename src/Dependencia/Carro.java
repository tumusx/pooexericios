package Dependencia;

public class Carro {
    private String modelo;
    private String marca;
    private boolean ligarfarol;
    private boolean andando;
    private int velocidade = 0;
    public Carro(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro(String cSroe) {
        this.modelo = cSroe;
    }

    public void ligarfarol( Chave  chave ) {
        if (chave == null) {
            System.out.println("Chave não encontrada");
        } else {
            this.ligarfarol = true;
        }
    }
    public void acelerarCarro(int i){
        this.velocidade +=10;
        if (this.velocidade > 0) {
            this.andando = true;
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void frearCarro(){
        if(this.velocidade > 0){
            this.velocidade -= 10;
        }
if (this.velocidade == 0){
    this.andando = true;
}
    }
@Override
    public String toString(){
        return "Modelo: " + this.modelo + "\nMarca: " + this.marca + "\nVelocidade: " + this.velocidade + "\nLigar farol: " + this.ligarfarol + "\nAndando: " + this.andando;
    }


}


package exemplosLivros.Classes;

public class Personagem {
    String nome;
    float altura;
    String tipoFisico;
    boolean possuiBigode;

    public Personagem (){
    }

    public double calcularArea(double lado){
        return lado*lado;
    }

    public double calcularArea(double baseMaior, double baseMenor){
            return baseMaior*baseMenor;
    }

    public double calcularArea(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }

    public double calcularArea(float diagonalMaior, float diagonalMenor){
        return diagonalMaior*diagonalMenor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTipoFisico() {
        return tipoFisico;
    }

    public void setTipoFisico(String tipoFisico) {
        this.tipoFisico = tipoFisico;
    }

    public boolean isPossuiBigode() {
        return possuiBigode;
    }

    public void setPossuiBigode(boolean possuiBigode) {
        this.possuiBigode = possuiBigode;
    }
    void pular(){

    }

void pegarCogumelo (Cogumelo cogumelo){

}

void BolaFogo (){

}





}



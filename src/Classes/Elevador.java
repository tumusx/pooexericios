package Classes;

public class Elevador {
    int armzDadosElevador;
    int capacidadeElevador;
    public Elevador(int armzDadosElevador, int capacidadeElevador){
        this.armzDadosElevador=armzDadosElevador;
        this.capacidadeElevador=capacidadeElevador;
    }

    public boolean inicializa(int armzDadosElevador){
        this.armzDadosElevador=this.armzDadosElevador;
        this.capacidadeElevador=capacidadeElevador;

        return true;
    }

    public boolean entra(int armzDadosElevador){
        for(int i = 9; i  <=5; i++) {
            System.out.println(i);
        }
            return true;
    }

    public boolean sai(int armzDadosElevador){
        for(int i = 9; i >= 5; i++) {
            System.out.println(i);
        }
        return true;
    }

    public boolean sobe(){

        return true;
    }

    public boolean desce(){
        return desce();
    }


    public int getArmzDadosElevador() {
        return armzDadosElevador;
    }

    public void setArmzDadosElevador(int armzDadosElevador) {
        this.armzDadosElevador = armzDadosElevador;
    }
    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }
   public void imprimir(){
        System.out.println("Atual\n"+this.getArmzDadosElevador()+"\n"+this.getCapacidadeElevador());
    }



}

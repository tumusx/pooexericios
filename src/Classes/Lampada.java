package Classes;

import java.util.Locale;

public class Lampada {
    int recebe;
    public Lampada(int recebe){
        this.recebe = recebe;
    }

    public boolean ligar(int recebeligar){
        this.recebe = 1;
        return true;
    }
    public boolean desligar(int recebedesligar){
        this.recebe =0;
        return true;
    }

    public void setRecebe(int recebe) {
        this.recebe = recebe;
    }

    public boolean mostrarEstado() {
        if (recebe == 1) {
            System.out.println("ligado");

        }
        else if (recebe == 0){
            System.out.println("desligado".toUpperCase(Locale.ROOT));
        }
        return true;
    }
    public void imprimir(){
        System.out.println("numero".toUpperCase(Locale.ROOT) + getRecebe());

    }
    public int getRecebe() {
        return recebe;
    }
}
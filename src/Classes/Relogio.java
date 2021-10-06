package Classes;

public class Relogio {
    int hora;

    public Relogio(int hora){
        this.hora=hora;
    }
    public boolean adicionarHora(){
        System.out.println("Horas somadas");
        for (int i = 6; i < 23; i++) {
            System.out.print("->" +i);
        }
        return true;
    }

    public boolean subtraiHora(){
        System.out.print("\n\nHoras subtraidas");
        for (int i = 6; i >= 1; i--) {
            System.out.print("->" +i);
        }

        return true;
    }
    public boolean mostraHora(){
        return true;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;

    }


}

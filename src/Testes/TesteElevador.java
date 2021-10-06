package Testes;
import Classes.Elevador;
public class TesteElevador {
    public static void main(String[] args){
        Elevador a = new Elevador(2,5);
        Elevador b = new Elevador(1,5);
        a.inicializa(a.getArmzDadosElevador());
        a.inicializa(a.getCapacidadeElevador());
        a.imprimir();


    }
}

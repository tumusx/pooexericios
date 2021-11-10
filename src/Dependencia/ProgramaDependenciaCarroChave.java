package Dependencia;

public class ProgramaDependenciaCarroChave {
    public static void main(String[] args) {
        Chave ch1 = new Chave("Chave Kia");
        Carro c1 = new Carro("CSroe");
        System.out.println(c1.toString());
        c1.acelerarCarro(10);

    }
}

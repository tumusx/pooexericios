package Agregação;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(String materia) {
        this.nome
 = materia;
    }

    public String getNome(){
        return nome;
    }
    public int getCargaHoraria(){
        return cargaHoraria;

    }

    public void imprimirNomeDisciplina() {
        System.out.println("Nome da disciplina: " + nome);
        System.out.println("Carga horária: " + cargaHoraria);
    }

    public void imprimirNomeDisciplina(int cargaHoraria) {
        System.out.println("Carga horária: " + cargaHoraria);

    }
}

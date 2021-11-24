package Bidirecional.exercicios;


public class TesteMainOrientadorAluno {
    public static void main(String[] args) {

        Orientador oriC = new Orientador("Carlos Barbosa");
    Orientador oriD = new Orientador("João Carlos");
    Orientador oriE = new Orientador("Maria Augusta");
    Aluno alu1 = new Aluno("252014130", "João Pereira");
    Aluno alu2 = new Aluno("25641510", "Maria Silva");
    Aluno alu3 = new Aluno("656622220", "Carlos Barbosa");
    Aluno alu4 = new Aluno("2524130", "João Tancredo");

    oriC.addAluno(alu1);
    oriC.removerAluno(alu1);
    oriD.addAluno(alu2);

        System.out.println(oriC.toString());
        System.out.println(alu1.toString());
        System.out.println(oriD.toString());


}}


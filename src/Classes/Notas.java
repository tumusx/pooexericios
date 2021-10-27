package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws FileNotFoundException {
        Double n1, n2, media;
        File arquivo= new File("src/texto.txt");
        Scanner dados = new Scanner(arquivo).useDelimiter(";|\n");
        while (dados.hasNextLine()){
            String nome = dados.next();
            String bTvariavel;
            bTvariavel= dados.next();
            n1 = Double.parseDouble(bTvariavel);
            bTvariavel=dados.next();
            n2= Double.parseDouble(bTvariavel);
            media=(n1+n2)/2;
            System.out.println("Nome do Aluno: "+nome);
            System.out.println("Primeira Nota: "+n1);
            System.out.println("Segunda Nota: "+n2);
            System.out.println("Media das Notas: "+media);
        }

        dados.close();


    }}




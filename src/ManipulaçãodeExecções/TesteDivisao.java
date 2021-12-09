package ManipulaçãodeExecções;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TesteDivisao {

    public static  float calculaQuociente(int n1, int n2) throws ArithmeticException {

        return n1/n2;
    }

    public static void main(String[] args) {
        boolean continuar = true;
        do {


        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("DVISAO DE DOIS NUMEROS");



            System.out.println("Digite o primeiro numero");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo numero");
            int n2 = sc.nextInt();

            float resultado = calculaQuociente(n1, n2);

            System.out.println("O resultado da divisão é: " + resultado);
            continuar = false;

        }


        catch (InputMismatchException l1){
            System.err.println("Erro de digitação");

        }

        catch (ArithmeticException n0) {
            System.err.println("Nao pode ser dividio por zero");
        }

        finally {
            System.out.println("Fim do programa");
        }
    }
    while (continuar);
}}
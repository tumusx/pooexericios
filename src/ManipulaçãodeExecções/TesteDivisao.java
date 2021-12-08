package ManipulaçãodeExecções;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TesteDivisao {

    public static void main(String[] args) {
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("DVISAO DE DOIS NUMEROS");

            System.out.println("Digite o primeiro numero");
            int n1 = sc.nextInt();

            System.out.println("Digite o segundo numero");
            int n2 = sc.nextInt();

            int resultado = n1 / n2;

            System.out.println("O resultado da divisão é: " + resultado);


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
}
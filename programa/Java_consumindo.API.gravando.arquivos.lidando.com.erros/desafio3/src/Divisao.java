import java.util.Scanner;

public class Divisao {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador");
        int numerador = scanner.nextInt();

        System.out.println("Informe o denominador");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("ERRO! Divisão por zero não é permitida");
        }
    }
}
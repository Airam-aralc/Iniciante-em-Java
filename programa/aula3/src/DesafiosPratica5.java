//Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;

public class DesafiosPratica5 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numDigitado = 0;

        System.out.println("Digite um número");
        numDigitado = leitor.nextInt();

        if (numDigitado % 2 == 0){
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");
        }
    }
}

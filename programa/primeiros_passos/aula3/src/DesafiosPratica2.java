//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class DesafiosPratica2 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in); // Lê números inteiros digitados
        int numInteiro1 = 0;
        int numInteiro2 = 0;

        System.out.println("Digite o primeiro número inteiro: ");
        numInteiro1 = leitor.nextInt();

        System.out.println("Digite o segundo número inteiro");
        numInteiro2 = leitor.nextInt();

        if (numInteiro1 == numInteiro2){
            System.out.println("Os números digitados são iguais");
        } else {
            System.out.println("Os números digitados são diferentes");

            if (numInteiro1 > numInteiro2) {
                System.out.println("Sendo o número 1 maior que o número 2");
            } else {
                System.out.println("Sendo o número 2 maior que o número 1");
            }
        }
    }
}

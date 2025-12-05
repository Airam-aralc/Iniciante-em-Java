//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class DesafiosPratica4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numtabuada = 0;
        int tabuada = 1;
        int resultado = 0;

        System.out.println("Digite um número para a tabuada");
        numtabuada = leitor.nextInt();

        while (tabuada < 11){
            resultado = numtabuada * tabuada;
            System.out.println(numtabuada + " * " + tabuada + " = " + resultado);
            tabuada ++;
        }
    }
}

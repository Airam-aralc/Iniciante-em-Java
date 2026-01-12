//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

import java.util.Scanner;

public class DesafiosPratica6 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int fatorial = 0;
        int fator= 0;
        int resultado;

        System.out.println("digite um número");
        fatorial = leitor.nextInt();

        while (fatorial != fator){
            resultado = fatorial * fator;
            System.out.println(fatorial + " * " + fator + " = " + resultado);
            fator++;
        }
    }
}

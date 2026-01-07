package org.desafio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Primo primo = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11));
    }
}

//        Scanner leitura = new Scanner(System.in);
//
//        System.out.println("\nVERIFICADOR DE NÚMEROS PRIMOS");
//        System.out.println("--------------------------------");
//        System.out.println("Digite um número para verificar: ");
//        var n = leitura.nextInt();
//
//        //Menor ou igual a 1 não é primo
//        if (n <= 1){
//            System.out.println(n + " não é primo");
//        } else {
//            boolean ehPrimo = true; //aqui o número é primo
//
//            //Tenta provar que o número não é primo
//            for (int i = 2; i < n ; i++) {
//                if (n % i == 0) {
//                    ehPrimo = false; //encontrou um divisor, então não é primo
//                    break;
//                }
//            }
//
//            //fora do for damos o veredito
//            if (ehPrimo){
//                System.out.println(n + " é primo");
//            } else {
//                System.out.println(n + " não é primo");
//            }
//        }
//
//        leitura.close();
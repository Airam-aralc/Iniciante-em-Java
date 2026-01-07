package org.desafio1;

public class Main {
    public static void main(String[] args) {

        //parâmetros de entrada, arrow(->) separa os parâmetros da lógica, lógica: retorno será o resultado
        Multiplicacao mult = (a, b) -> a * b;
        System.out.println(mult.multiplicacao(5, 3));  // O objeto mult armazena a lógica
    }
}
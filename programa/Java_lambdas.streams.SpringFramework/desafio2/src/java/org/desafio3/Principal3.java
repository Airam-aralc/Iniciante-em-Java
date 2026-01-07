package org.desafio3;

public class Principal3 {
    public static void main(String[] args){

        Transformador toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transformar("java"));
    }
}

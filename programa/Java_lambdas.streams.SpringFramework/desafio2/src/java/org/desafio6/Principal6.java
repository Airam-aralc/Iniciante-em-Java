package org.desafio6;

import java.util.Arrays;
import java.util.List;

public class Principal6 {
    public static void main(String[] args){

        List<String> nomes = Arrays.asList("Maria", "Pablo", "Dan", "Binho");
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println(nomes);
    }
}

package br.com.alura.questao4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicado {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        // removendo as palavras duplicadas
        List<String> palavrasDuplicadas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(palavrasDuplicadas);
    }
}

package br.com.alura.questao3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Impar {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //pegar os números impares e multiplicar por 2
        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(numerosImpares);

    }
}

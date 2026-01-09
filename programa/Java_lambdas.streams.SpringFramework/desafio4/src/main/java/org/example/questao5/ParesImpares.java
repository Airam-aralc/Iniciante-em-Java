package org.example.questao5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParesImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> par = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Pares: " + par.get(true));
        System.out.println("Ímpares: " + par.get(false));
    }
}

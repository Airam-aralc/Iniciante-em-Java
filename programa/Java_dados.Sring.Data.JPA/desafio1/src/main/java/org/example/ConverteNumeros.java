package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConverteNumeros {
    public static void main(String[] args){

        List<String> entrada = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> resultado = entrada.stream()
                .map(str -> {
                    try {
                        return Optional.of(Integer.parseInt(str));
                    } catch (NumberFormatException e) {
                        return Optional.<Integer>empty();
                    }
                }) .filter(Optional::isPresent) .map(Optional::get) .toList();

        System.out.println(resultado);
    }
}

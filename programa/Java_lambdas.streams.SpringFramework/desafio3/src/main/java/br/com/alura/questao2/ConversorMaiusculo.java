package br.com.alura.questao2;

import java.util.Arrays;
import java.util.List;

public class ConversorMaiusculo {
        public static void main(String[] args) {

            List<String> palavras = Arrays.asList("java", "stream", "lambda");

            palavras.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        }
}

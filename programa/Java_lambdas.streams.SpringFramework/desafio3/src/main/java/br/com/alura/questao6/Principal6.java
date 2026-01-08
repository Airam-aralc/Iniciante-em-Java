package br.com.alura.questao6;

import java.util.Arrays;
import java.util.List;

public class Principal6 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );

        //Filtrar pessoas

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);
    }
}
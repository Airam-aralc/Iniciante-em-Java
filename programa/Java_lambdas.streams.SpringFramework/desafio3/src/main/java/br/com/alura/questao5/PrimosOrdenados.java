package br.com.alura.questao5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimosOrdenados {
    public static void main(String[] args) {

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        //Filtrar e ordenar números primos
        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(List::stream) // colocar tudo em uma lista
                .filter(PrimosOrdenados::ehPrimo) //filtrar apenas primos
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numerosPrimos);
    }

    //função para verificar números primos
    private static boolean ehPrimo(int numeros){
        if (numeros < 2) return false;
        for (int i = 2 ; i <= Math.sqrt(numeros); i++){
            if (numeros % i == 0){
                return false;
            }
        }
        return true;
    }
}

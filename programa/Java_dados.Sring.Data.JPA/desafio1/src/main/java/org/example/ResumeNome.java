package org.example;

public class ResumeNome {
    public static void main(String[] args){

        System.out.println(obterPrimeiroEUltimoNome("    Maria Clara Alves    "));
        System.out.println(obterPrimeiroEUltimoNome("Maria   "));
    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto){

        String[] nomes = nomeCompleto.trim().split("\\s+");
        if (nomes.length == 1){
            return nomes[0];
        }

        return nomes[0] + nomes[nomes.length - 1];
    }
}

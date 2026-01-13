package org.example;

public class EhPalindromo {
    public static void main(String[] args) {

        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false
    }
    public static boolean ehPalindromo(String palavra) {

        String semEspaco = palavra.replace(" ", "").toLowerCase();
        return new StringBuilder(semEspaco).reverse().toString().equalsIgnoreCase(semEspaco);
    }
}

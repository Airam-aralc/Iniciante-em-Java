//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

public class ConverterDollar {
    public static void main (String [] args){
        double valorEmDollar = 8.79;
        double conversor = valorEmDollar * 4.94;

        System.out.println("A conversão do valor em dollar para real é " + conversor + "R$");
    }
}

//Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

public class Percentual {
    public static void main (String [] args){
        double precoOriginal = 6.5;
        int percentualDesconto = 10;
        double descontoDoPreco = 0.1 * 6.5;
        double desconto = precoOriginal - descontoDoPreco;

        System.out.println("O produto com o desconto de " + percentualDesconto + "% é " + desconto + "R$");
    }
}

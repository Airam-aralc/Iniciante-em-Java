//Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

public class PrecoQuantia {
    public static void main(String [] args){
        double precoProduto = 8.99;
        int quantidade = 2;
        double multiplicacao = precoProduto * quantidade;

        System.out.println("O valor total da compra é de " + multiplicacao + "R$");
    }
}

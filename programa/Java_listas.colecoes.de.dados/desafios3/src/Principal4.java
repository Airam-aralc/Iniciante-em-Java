import java.util.ArrayList;

public class Principal4 {

    public static void main(String[] args){
        Produto produto1 = new Produto("Creme de cabelo", 31.89);
        Produto produto2 = new Produto("Pente", 12.99);
        Produto produto3 = new Produto("Gelatina capilar", 25.69);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaDeProdutos){
            somaPrecos += produto.getPreco();
        }

        double mediaPreco = somaPrecos / listaDeProdutos.size();
        System.out.println("\nA soma dos produtos é " + somaPrecos + "R$ e sua média é " + mediaPreco + "R$");
    }
}

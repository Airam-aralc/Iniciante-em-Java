public class Principal3 {

    public static void main (String[] args){
        Produto produto = new Produto("Celular", 2000.0); //Vai entrar na "função" Preco

        System.out.println("\nNome do produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("O novo preço com o desconto é R$ " + produto.getPreco());
    }
}

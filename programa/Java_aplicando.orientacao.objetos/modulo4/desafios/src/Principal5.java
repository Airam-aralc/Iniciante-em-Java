public class Principal5 {

    public static void main(String[] args){
        Livro livro = new Livro(28, "O Hobbit");
        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());

        ProdutoFisico produto = new ProdutoFisico(28);
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());
    }
}

public class Principal6 {

    public static void main(String[] args){
        Produto6 produto = new Produto6("Livro", 30);
        produto.aplicarDesconto(20);
        double totalProduto = produto.calcularPrecoTotal(2); //colocar o metodo dentro de uma varável para eu mostrar um resultado para o meu usuário
        System.out.println("\nO produto custa ao todo: R$ " + totalProduto);

        Servico servico = new Servico("Organizador de livros", 20);
        servico.aplicarDesconto(10);
        double totalServico = servico.calcularPrecoTotal(1);
        System.out.println("O total do serviço custa: R$ " + totalServico);
    }
}

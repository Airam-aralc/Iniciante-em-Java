public class ProdutoFisico extends Produto implements Calculavel{

    //Para o extends Produto
    public ProdutoFisico(double preco) {
        super(preco);
    }

    //Para o implement Calculavel
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05; //taxa adicional 5%
    }
}

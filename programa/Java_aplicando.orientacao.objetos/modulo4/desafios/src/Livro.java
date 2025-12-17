public class Livro extends Produto implements Calculavel{
    private String titulo;

    //Para o extends Produto
    public Livro(double preco, String titulo) {
        super(preco);
        this.titulo = titulo;
    }

    //Para o implements Calculavel
    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}

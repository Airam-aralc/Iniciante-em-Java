public class PodutoPeriferico extends Produto{
    private String marca;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public PodutoPeriferico(String nome, double preco, int quantidade, String marca) {
        super(nome, preco, quantidade);
        this.marca = marca;
    }
}

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) { //vai ter obrigatoriamente isso
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {//Quando lançar a compra ele irá retornar verdadeiro ou falso
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor(); //se eu tiver saldo eu vou descontar o valor do produto nele
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    //Não quero que o usuário modifique esses valores, por isso não incluí os set
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}

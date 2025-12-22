public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo){ //construtor
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    //Get - ler os valores, mas não os modifica na classe principal
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

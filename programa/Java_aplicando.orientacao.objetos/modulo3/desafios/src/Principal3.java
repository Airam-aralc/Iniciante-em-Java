public class Principal3 {

    public static void main(String[] args){
        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.depositar(1200);
        minhaConta.sacar(150);
        minhaConta.cobrarTarifa();
        minhaConta.consultarSaldo();
    }
}
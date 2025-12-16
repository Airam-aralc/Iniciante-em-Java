public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor; //saldo = saldo + valor
        System.out.println("\nDepósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public void sacar (double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para a transação");
        }
    }

    public void consultarSaldo(){
        System.out.println("\nSaldo atual: R$ " + saldo);
    }
}
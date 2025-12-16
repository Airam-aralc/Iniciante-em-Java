public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 20;

    public void TarifaMensal(double tarifaMensal){
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifa(){
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de: R$ " + tarifaMensal + " cobrado. Saldo atual de: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para cobrar na tarifa");
        }
    }
}
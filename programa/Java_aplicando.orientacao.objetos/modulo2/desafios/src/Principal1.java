public class Principal1 {

    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.setNumeroConta(202504);
        conta.setSaldo(5019.98);

        System.out.println("\nTitular: " + conta.titular); //público
        System.out.println("Número da conta: " + conta.getNumeroConta()); //privado
        System.out.println("Saldo: R$ " + conta.getSaldo()); //privado
    }
}

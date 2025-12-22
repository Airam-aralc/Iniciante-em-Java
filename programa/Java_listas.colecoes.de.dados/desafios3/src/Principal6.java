import java.util.ArrayList;

public class Principal6 {

    public static void main (String[] args){
        ContaBancaria conta1 = new ContaBancaria(202501, 50098.79);
        ContaBancaria conta2 = new ContaBancaria(202502, 3098.99);
        ContaBancaria conta3 = new ContaBancaria(202503, 80097.0);

        ArrayList<ContaBancaria> listasConta = new ArrayList<>();
        listasConta.add(conta1);
        listasConta.add(conta2);
        listasConta.add(conta3);

        ContaBancaria contaMaiorSaldo = listasConta.get(0); //vai comparar todas as contas a partir da primeira
        for (ContaBancaria conta : listasConta) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("\nConta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}

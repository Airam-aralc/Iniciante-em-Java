import java.util.Scanner;

public class DesafioFinal {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String nome = "Maria Clara";
        String tipoConta = "Corrente";
        float saldo = 5000;
        float valorRecebido, valorTransferido;
        int opcao = 0;

        System.out.println("\n*********************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("*********************************\n");

        String menu = """
                ** Digite a sua opção **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (opcao != 4){
            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            if (opcao == 1){ // Saldo
                System.out.println("O saldo atual é: " + saldo);
            }
                else if (opcao == 2) { // Receber dinheiro
                    System.out.print("Digite o valor recebido: ");
                    valorRecebido = leitor.nextFloat();
                    saldo = valorRecebido + saldo; // acho que não precisa o Saldo atual
                    System.out.println("Saldo atualizado: R$ " + saldo);
                }
                    else if (opcao == 3) { // Transferir dinheiro
                        System.out.println("Digite o valor da transferência: ");
                        valorTransferido = leitor.nextFloat();
                        if (valorTransferido > saldo){
                            System.out.println("Saldo insuficiente");
                        } else{
                            saldo = saldo - valorTransferido;
                            System.out.println("O saldo atual é: R$ " + saldo);
                        }
                    }
                        else if (opcao == 4) { // Sair
                            System.out.println("Saindo do programa");
                        }
                            else { // Opção inválida
                                System.out.println("Opção inválida");
                                break;
                            }
        }
    }
}

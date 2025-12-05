//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

import java.util.Scanner;

public class DesafiosPratica3 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;

        System.out.println("Digite 1 para calcular a área do quadrado ou Digite 2 para calcular a área do círculo");
        escolha = leitor.nextInt();

        switch (escolha){
            case 1:
                float lado, areaQ;
                System.out.println("Área do quadrado- INFORME O TAMANHO DO LADO (em cm)");
                lado = leitor.nextFloat();

                areaQ = lado * lado;

                System.out.println("A área do quadrado é " + areaQ + "cm²");
                break;
            case 2:
                float raio, areaC;
                System.out.println("Área do círculo-INFORME O TAMANHO DO RAIO (em cm)");
                raio = leitor.nextFloat();

                areaC = 3 * (raio*raio);

                System.out.println("A área do círculo é " + areaC + "cm²");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

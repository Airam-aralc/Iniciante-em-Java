//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
//A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

import java.util.Scanner; // ler a entrada do usuário
import java.util.Random;  // gerar números aleatórios

public class JogoDeAdvinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // lê a entrada do usuário a partir do teclado
        int numeroGerado = new Random().nextInt(100); // para gerar o número aleatório entre 0 e 99 e armazenar na variável "numeroGerado"
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) { //vai continuar o loop enquanto o número de tentativas for menor do que 5
            System.out.println("Digite um numero entre 0 e 100");
            numeroDigitado = leitor.nextInt(); //ler o número que o usuário digitou e armazenar na variável "numeroDigitado"
            tentativas++; //incrementação para o loop não ficar executando infinitamente

            if (numeroDigitado == numeroGerado) { //Se o usuário acertar o número sorteado
                System.out.println("Parabéns! Você acertou o numero em " + tentativas + " tentativas");
                break; //interrompe o loop while antes das 5 tentativas
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o número gerado");
            } else {
                System.out.println("O numero digitado é maior que o numero gerado");
            }

            if (tentativas == 5 && numeroDigitado != numeroGerado) { //se esgotou o número de tentativas e o usuário não acertou o numero sorteado
                System.out.println("Você não conseguiu acertar o numero em 5 tentativas. O numero era: " + numeroGerado);
            }
        }
    }
}
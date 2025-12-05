//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner; //Para ler a entrada que o usuário digitar

public class DesafiosPratica1 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in); //lê a entrada do usuário digitado no teclado
        int numDigitado = 0; //inicializa a variável que vai armazenar o número que o usuário digitou em 0

        System.out.println("Digite um número: ");
        numDigitado = leitor.nextInt(); // lê o numero e armazena na variável

        if(numDigitado >= 0){
            System.out.println("O número digitado é positivo");
        } else{
            System.out.println("O número digitado é negativo");
        }
    }
}

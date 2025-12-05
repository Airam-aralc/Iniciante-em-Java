import java.util.Scanner;

public class Leitura {
    public static void main() { //atalho psvm
        Scanner leitura = new Scanner(System.in); //ler o que o usuário digitar no teclado

        System.out.println("Digite o seu filme favorito ");
        String filme = leitura.nextLine(); //ler o que digitou e armazenar na variável filme

        System.out.println("Qual é o ano de lançamento");
        int anoDeLancamento = leitura.nextInt(); //para ler o numero

        System.out.println("Qual nota você dá para " + filme);
        double avaliacao = leitura.nextDouble();//para valor decimal

        System.out.println("Em " + anoDeLancamento + " foi lançado o melhor filme de todos os tempos: " + filme + "com nota de " + avaliacao);
    }
}
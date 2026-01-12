import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito ");
        String filme = leitura.nextLine();

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) { //enquanto a nota for diferente de -1 o loop irá continuar
            System.out.println("Qual nota você dá para " + filme + " ou digite -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) { // para ele não somar o -1 na média
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media das avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}
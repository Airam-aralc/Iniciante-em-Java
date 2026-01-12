import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito ");
        String filme = leitura.nextLine();

        double mediaAvaliacao = 0; //acumular avaliações para fazer a média
        double nota = 0;

        for (int i = 0; i < 3; i++) { // atalho fori
            System.out.println("Qual nota você dá para " + filme);
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; // vai receber o que ele já tinha mais a nota
        }

        System.out.println("Media das avaliações: " + mediaAvaliacao/3);
    }
}

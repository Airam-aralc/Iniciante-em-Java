//Instanciação de objetos

import br.com.alura.modulo2.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo referência
        meuFilme.setNome("O Hobbit"); //é o que faz refêrencia a this
        meuFilme.setAnoDeLancamento (2011);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("\nSoma das avaliações: " + meuFilme.getSomaAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
    }
}
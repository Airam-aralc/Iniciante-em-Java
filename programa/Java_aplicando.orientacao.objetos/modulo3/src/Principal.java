import br.com.alura.modulo3.modelos.Filme;
import br.com.alura.modulo3.modelos.Series;

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

        Series series = new Series();
        series.setNome("Lost");
        series.setAnoDeLancamento(2000);
        series.exibeFichaTecnica();
        series.setTemporadas(8);
        series.setEpisodiosPorTemporada(12);
    }
}
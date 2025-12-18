import br.com.alura.javaListasColecoesDeDados.calculos.CalculadoraDeTempo;
import br.com.alura.javaListasColecoesDeDados.calculos.FiltroRecomendacao;
import br.com.alura.javaListasColecoesDeDados.modelos.Episodios;
import br.com.alura.javaListasColecoesDeDados.modelos.Filme;
import br.com.alura.javaListasColecoesDeDados.modelos.Series;

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
        System.out.println("Soma das avaliações: " + meuFilme.getSomaAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Series series = new Series();
        series.setNome("Lost");
        series.setAnoDeLancamento(2000);
        series.exibeFichaTecnica();
        series.setTemporadas(8);
        series.setEpisodiosPorTemporada(12);
        series.setMinutosPorEpisodio(60);

        System.out.println("Duração para maratonar " + series.getNome() + ": " + series.getDuracaoEmMinutos());

        //Foi criado outro filme para testar a calculadora
        Filme outroFilme = new Filme();
        outroFilme.setNome("Senhor dos anéis");
        outroFilme.setAnoDeLancamento (2014);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(series);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(series);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);
    }
}
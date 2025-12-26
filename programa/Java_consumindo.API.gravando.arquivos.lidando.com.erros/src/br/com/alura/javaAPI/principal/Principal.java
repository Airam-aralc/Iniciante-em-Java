package br.com.alura.javaAPI.principal;

import br.com.alura.javaAPI.calculos.CalculadoraDeTempo;
import br.com.alura.javaAPI.calculos.FiltroRecomendacao;
import br.com.alura.javaAPI.modelos.Episodios;
import br.com.alura.javaAPI.modelos.Filme;
import br.com.alura.javaAPI.modelos.Series;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Hobbit", 2012);
        //meuFilme.setNome("O Hobbit"); //Ao criar o construtor essa linha some e o nome do filme vai direto em Filme("...")
        //meuFilme.setAnoDeLancamento (2012);
        meuFilme.setDuracaoEmMinutos(160);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações: " + meuFilme.getSomaAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Senhor dos anéis: Sociedade do anel", 2001);
        //outroFilme.setNome("Senhor dos anéis: Sociedade do anel");
        //outroFilme.setAnoDeLancamento(2001);
        outroFilme.setDuracaoEmMinutos(178);
        outroFilme.avalia(10);

        //Criação do construtor
        Filme maisUmFilme = new Filme("Senhor dos anéis: O retorno do rei", 2002);
        //maisUmFilme.setNome("Senhor dos anés: O retorno do rei");
        //maisUmFilme.setAnoDeLancamento(2002);
        maisUmFilme.setDuracaoEmMinutos(180);
        maisUmFilme.avalia(9.5);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); // irá armazenar os filmes
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(maisUmFilme);
        System.out.println("\nTamanho da lista: " + listaDeFilmes.size()); //mostrar o tamanho da lista
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome()); //vai pegar o primeiro filme, começa em 0 e ele vai pegar o nome do filme
        System.out.println(listaDeFilmes); //apareceu o nome e data de lançamento dos filmes depois de modificar o toString na classe Filme
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString()); //toString() é um metodo que tem como objetivo retornar uma representação em texto de um objeto



        Series series = new Series("Lost", 2000);
        //series.setNome("Lost");
        //series.setAnoDeLancamento(2000);
        series.exibeFichaTecnica();
        series.setTemporadas(8);
        series.setEpisodiosPorTemporada(12);
        series.setMinutosPorEpisodio(60);

        System.out.println("Duração para maratonar " + series.getNome() + ": " + series.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(maisUmFilme);
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
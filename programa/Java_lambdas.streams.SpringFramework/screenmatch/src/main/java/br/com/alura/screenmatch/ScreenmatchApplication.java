package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi(); //var (inferência de tipo). O compilador Java é capaz de determinar o tipo da variável com base no tipo do objeto que está sendo atribuído a ela.
        var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=463d14c9");
        System.out.println(json);

        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=463d14c9");
        DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
        System.out.println(dadosEpisodio);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i<= dados.totalTemporadas(); i++){
            json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&episode=2&apikey=463d14c9");
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println); //Cada elemento da lista será impresso
    }
}
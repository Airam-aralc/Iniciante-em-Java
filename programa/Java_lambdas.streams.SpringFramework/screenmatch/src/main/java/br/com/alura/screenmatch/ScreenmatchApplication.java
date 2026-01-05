package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi(); //var (inferência de tipo). O compilador Java é capaz de determinar o tipo da variável com base no tipo do objeto que está sendo atribuído a ela.
        var json = consumoApi.obterDados("http://www.omdbapi.com/?t=lost&apikey=463d14c9");
        System.out.println(json);

        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
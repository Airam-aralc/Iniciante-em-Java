package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias; //como um apelido
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //ignora o que não queremos, só nos interessamos por título, total de temporadas e avaliação
public record DadosSerie(@JsonAlias ("Title") String titulo,
                         @JsonAlias ("totalSeasons") Integer totalTemporadas,
                         @JsonAlias ("imdbRating") String avaliacao) {
}

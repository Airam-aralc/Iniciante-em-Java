package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.service.traducao.ConsultaMyMemory;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

@Entity //indica que a classe Serie será uma tabela no banco
@Table(name = "series") //o nome dessa tabela no banco será series

public class Serie {
    @Id //inicando que aquele será o seu id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //a estratégia de geração
    private Long id;

    @Column(unique = true) //Os títulos não podem se repetir
    private String titulo;

    private Integer totalTemporadas;

    private Double avaliacao;

    @Enumerated(EnumType.STRING)
    private Categoria genero;

    private String atores;

    private String poster;

    private String sinopse;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL) //cardinalidade - banco de dados
    private List<Episodio> episodios = new ArrayList<>();

    public Serie(){} //construtor padrão

    public Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0); //eu tento pegar um valor double, caso contrário irá aparecer como 0
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
        this.sinopse = ConsultaMyMemory.obterTraducao(dadosSerie.sinopse()).trim();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }
    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAtores() {
        return atores;
    }
    public void setAtores(String atores) {
        this.atores = atores;
    }

    public Categoria getGenero() {
        return genero;
    }
    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Gênero= " + genero +
                "\nTítulo= " + titulo +
                "\nTotal de temporadas= " + totalTemporadas +
                ", avaliação= " + avaliacao +
                "\nAtores= " + atores +
                "\nPoster='" + poster +
                "\nSinopse='" + sinopse;
    }
}

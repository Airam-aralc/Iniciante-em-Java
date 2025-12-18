package br.com.alura.javaListasColecoesDeDados.modelos;

import br.com.alura.javaListasColecoesDeDados.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Series serie;
    private int totalVisualizacoes;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }
    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
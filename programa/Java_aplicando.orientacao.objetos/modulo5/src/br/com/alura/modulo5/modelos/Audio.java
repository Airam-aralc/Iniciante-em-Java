package br.com.alura.modulo5.modelos;

//Superclasse
public class Audio {

    protected double duracao; // Em segundos
    protected int totalDeReproducao;
    protected int curtidas;
    protected int classificacao;


    //Como todos os Setters o usuário poderá modificar os valores na principal, só usei o getDuracao para que faça a conversão de segundos para minutos

    public double getDuracao() {
        return duracao / 60; //converter segundos para minutos
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }
    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void tituloDaObras(){
        System.out.println("O titulo da música ou do podcast");
    }

    public void exibeFichaTecnica(){
        System.out.println("Tem duração de " + getDuracao() + " minutos, foi reproduzida " + totalDeReproducao + " vezes, com " + curtidas +" curtidas, ocupando a classificação " + classificacao + " no ranking");
    }
}

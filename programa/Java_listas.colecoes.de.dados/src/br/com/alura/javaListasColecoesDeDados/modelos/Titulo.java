//Herança- Essa classe Titulo foi criada para armazenar as informações semelhantes de filmes e séries

package br.com.alura.javaListasColecoesDeDados.modelos;

public class Titulo {
    private String nome; //String é uma classe, veja no Java Doc
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes; // modificadores de acesso
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    //METODOS - Maneira de fazer tal coisa

    public void exibeFichaTecnica() {
        System.out.println("\nNome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota; // irá somar as avaliações
        totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacao;
    }

    //Metodo acessor - O usuário vai poder acessar, mas não modificar
    public int getTotalDeAvaliacao() { //No Java é comum usar o "get" para pegar algo e o "set" para colocar algo
        return totalDeAvaliacao;
    }

    public double getSomaAvaliacoes(){
        return somaAvaliacoes;
    }

    //SETTERS
    public void setNome(String nome) { //pode usar o atalho do "generate" - Alt + insert
        this.nome = nome; // "this" o nome deste objeto
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
public class Filme { // A Classe especifíca o conteúdo de um Objeto
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes; // atalho shift F6 para mudar o nome da variável em todas as partes do código
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    //Criação do Metodo - Maneira de fazer tal coisa
    void exibeFichaTecnica() {
        System.out.println("\nNome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota; // irá somar as avaliações
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacao;
    }
}
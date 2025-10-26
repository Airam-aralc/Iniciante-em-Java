public class Main {
    public static void main (String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //media calculada pelas três notas dadas ao filme
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;

        //Maneira mais fácil e prática para escrever vários textos sem precisar colocar muitos "System.out..."
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bem avaliado
                Ano de lançamento:
                """ + ano;
        System.out.println(sinopse);

        //uso do casting, que é a conversão de tipos, já que o nosso tipo de variável é inteira e nosso calculo é decimal, mas queremos um resultado inteiro
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
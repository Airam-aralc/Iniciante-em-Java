public class Main {
    public static void main (String [] args){
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento recente");
        } else{
            System.out.println("Lançamento não recente");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar uma quantia a mais");
        }
    }
}
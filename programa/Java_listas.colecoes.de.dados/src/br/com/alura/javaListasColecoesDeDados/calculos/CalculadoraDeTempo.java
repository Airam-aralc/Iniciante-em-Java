package br.com.alura.javaListasColecoesDeDados.calculos;

//import br.com.alura.javaListasColecoesDeDados.modelos.Filme;
//import br.com.alura.javaListasColecoesDeDados.modelos.Series;
import br.com.alura.javaListasColecoesDeDados.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {//Quem usar vai poder recuperar o tempo total
        return tempoTotal;
    }
    //Não foi usado o Setter(setTempoTotal) pq eu quero que a calculadora faça a soma

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Series s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    //Foi aplicado o polimorfismo ao invés de incluir Filme e Serie só incluiu o Titulo
    public void inclui(Titulo titulo){ //Foi feito o "Polimorfismo" para o código ficar mais "limpo"
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
//Vai pegar tudo o que tem em título e colocar a mais essas informações que só estão contidas nessa classe

package br.com.alura.javaListasColecoesDeDados.modelos;

import br.com.alura.javaListasColecoesDeDados.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { //Vai pegar todas as informações na classe Titulo e juntar com as presentes nesta classe
    private String diretor;

    //Criou um construtor
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {

        return diretor;
    }
    public void setDiretor(String diretor) {

        this.diretor = diretor;
    }

    @Override //para o implements Classificável execute
    public int getClassificacao() {

        return (int) pegaMedia() / 2; //cast - converter um tipo de dado em outro
    }

    @Override //Sobrescrita da toString
    public String toString() {

        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
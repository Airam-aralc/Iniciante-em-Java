//Vai pegar tudo o que tem em título e colocar a mais essas informações que só estão contidas nessa classe

package br.com.alura.modulo3.modelos;

public class Filme extends Titulo { //Vai pegar todas as informações na classe Titulo e juntar com as presentes nesta classe
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
package br.com.alura.desafio1;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public Tarefa(){}

    public String getDescricao() {
        return descricao;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public boolean isConcluida() {
        return concluida;
    }


    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa: Descrição= " + descricao + "\nConcluída= " + concluida + ", pessoa responsável= " + pessoaResponsavel;
    }
}

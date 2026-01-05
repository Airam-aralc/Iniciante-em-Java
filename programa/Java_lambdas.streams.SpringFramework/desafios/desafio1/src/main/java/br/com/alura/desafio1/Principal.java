package br.com.alura.desafio1;

import br.com.alura.desafio1.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Finalizar desafio de serialização", false, "Maria Clara");

        ObjectMapper mapper = new ObjectMapper();

        try {
            File arquivo = new File("tarefa.json");
            mapper.writeValue(arquivo, tarefa);

            System.out.println("Arquivo tarefa.json criado com sucesso!");

            Tarefa tarefaLida = mapper.readValue(new File("tarefa.json"), Tarefa.class);
            System.out.println("\nTarefa lida");
            System.out.println(tarefaLida);

        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
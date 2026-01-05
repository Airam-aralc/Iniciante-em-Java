package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //Retorno genérico, eu ainda não sei qual é
}

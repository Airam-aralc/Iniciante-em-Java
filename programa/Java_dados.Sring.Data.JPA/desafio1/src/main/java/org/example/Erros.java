package org.example;

public class Erros {
    public static void main(String[] args){

        System.out.println(CodigoErro.NOT_FOUND.getCodigo()); // 404
        System.out.println(CodigoErro.BAD_REQUEST.getDescricao()); // Requisição inválida
    }
}

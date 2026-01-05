package br.com.alura.desafio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nSEJA BEM VINDO AO CONTADOR!");
        System.out.println("-----------------------------");
        System.out.println("Digite um número para contagem: ");
        var numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++){
            System.out.println(i + " ");
        }
    }
}

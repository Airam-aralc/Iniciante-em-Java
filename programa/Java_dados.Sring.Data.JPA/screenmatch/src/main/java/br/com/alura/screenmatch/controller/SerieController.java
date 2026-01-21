package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repositorio;

    @GetMapping("/series") //quando tiver uma requisição de séries vc vai fazer o metodo abaixo
    public List<Serie> obterSeries(){
        return repositorio.findAll();
    }

}

package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.dto.SerieDTO;
import br.com.alura.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService servico;

    @GetMapping("/series") //quando tiver uma requisição de séries vc vai fazer o metodo abaixo
    public List<SerieDTO> obterSeries(){
        return servico.obterTodasAsSeries();
    }
}

package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedicos;
import org.springframework.web.bind.annotation.*;

@RestController //faz a comunicação Spring
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedicos dados){ //para saber que esse json está vindo do corpo da requisição
        System.out.println(dados);
    }

}

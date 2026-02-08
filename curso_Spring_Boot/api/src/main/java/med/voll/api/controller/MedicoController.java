package med.voll.api.controller;

import med.voll.api.endereco.Endereco;
import med.voll.api.medico.DadosCadastroMedicos;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //faz a comunicação Spring
@RequestMapping("medicos")
public class MedicoController {

    @Autowired //Injeção de dependências
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedicos dados){ //para saber que esse json está vindo do corpo da requisição
        repository.save(new Medico(dados));
    }

}

package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//API Rest, não uma aplicação Web

@RestController
@RequestMapping
public class InicioApiController {

    @GetMapping
    public String IniciandoApi(){
        return "API Iniciada com Sucesso!";
    }
}

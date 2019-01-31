package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {

    public final static Logger logger = LogManager.getLogger(ApplicationController.class);

    @RequestMapping("/")
    public String paginaInicial(){
        logger.info("paginaInicial : Bem vindo a pagina inicial");
        return "<h1> Pagina inicial</h1>";
    }

    @RequestMapping("/Error")
    public String ErrorMessage(){
        logger.error("ErrorMessage : Aqui deu pau no sistema");
        return "<h1> Mensagem de erro</h1>";
    }

    @RequestMapping("/Info")
    public String InfoMessage(){
        logger.info("InfoMessage : Informação do sistema");
        return "<h1> Mensagem de informação</h1>";
    }

    @RequestMapping("/Debug")
    public String DebugMessage(){
        logger.debug("DebugMessage : Debugando o sistema");
        return "<h1> Mensagem de debug</h1>";
    }

    @RequestMapping("/json")
    @PostMapping
    public String RetornaJson(@RequestBody String frase){
        logger.info("RetornaJson : " + frase);
        return "<h1> Mensagem de json</h1>";
    }

}

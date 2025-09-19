package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Autor;
import com.example.biblioteca.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorControler {
    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor){
        return autorService.criarAutor(autor.getNome(), autor.getIdade());
    }

}

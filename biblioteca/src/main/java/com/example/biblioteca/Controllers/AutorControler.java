package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Autor;
import com.example.biblioteca.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorControler {
    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return autorService.criarAutor(autor.getNome(), autor.getIdade());
    }

    @GetMapping
    public List<Autor> getAutor() {
        return autorService.getAutor();
    }
    @GetMapping("/{id}")
    public Autor getAutorID(@PathVariable Long id){
        return autorService.getAutorID(id);
    }

}

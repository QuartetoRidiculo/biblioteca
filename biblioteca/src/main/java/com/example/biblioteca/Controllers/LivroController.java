package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Livro;
import com.example.biblioteca.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro addLivro(Livro livroAdicionado){
        return livroService.addLivro(livroAdicionado);
    }

    @DeleteMapping
    public void deleteLivro(Long livroId){
        livroService.deleteLivro(livroId);
    }

    @GetMapping
    public List<Livro> listLivros(){
        return livroService.listLivros();
    }

}

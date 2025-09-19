package com.example.biblioteca.Controllers;

import com.example.biblioteca.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping("/{idLivro}/categorias/{idCategoria}")
    public void addCategoriaAoLivro(@PathVariable Long idLivro, @PathVariable Long idCategoria) {
        livroService.addCategoriaAoLivro(idLivro, idCategoria);
    }
}

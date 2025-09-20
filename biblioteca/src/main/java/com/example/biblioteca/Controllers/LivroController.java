package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Livro;
import com.example.biblioteca.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro addLivro(@RequestBody Livro livroAdicionado) {
        return livroService.addLivro(livroAdicionado);
    }

    @PostMapping("/{idLivro}/categorias/{idCategoria}")
    public void addCategoriaAoLivro(@PathVariable Long idLivro, @PathVariable Long idCategoria) {
        livroService.addCategoriaAoLivro(idLivro, idCategoria);
    }

    @DeleteMapping("/{livroId}")
    public void deleteLivro(@PathVariable Long livroId) {
        livroService.deleteLivro(livroId);
    }

    @GetMapping
    public List<Livro> getLivros() {
        return livroService.getLivros();
    }

    @GetMapping("/{id}")
    public Livro getLivroId(Long id) {
        return livroService.getLivroId(id);
    }
}

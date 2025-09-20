package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Livro;
import com.example.biblioteca.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//Caminho requerido no site
@RequestMapping("/livros")
public class LivroController {

    //
    @Autowired
    private LivroService livroService;

    //Adiciona livro
    @PostMapping
    public Livro addLivro(@RequestBody Livro livroAdicionado){
        return livroService.addLivro(livroAdicionado);
    }
  
    @PostMapping("/{idLivro}/categorias/{idCategoria}")
    public void addCategoriaAoLivro(@PathVariable Long idLivro, @PathVariable Long idCategoria) {
        livroService.addCategoriaAoLivro(idLivro, idCategoria);
    }
  
    @DeleteMapping
    public void deleteLivro(@RequestBody Long livroId){
        livroService.deleteLivro(livroId);
    }

    @GetMapping
    public List<Livro> listLivros() {
        return livroService.listLivros();
    }

    @GetMapping("/{id}")
    public Livro getLivroId(Long id){
        return livroService.listLivrosId(id);
    }
}

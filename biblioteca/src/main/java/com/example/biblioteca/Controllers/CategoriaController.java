package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Categoria;
import com.example.biblioteca.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getCategoria(){
        return categoriaService.getCategoria();
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria){
        return categoriaService.createCategoria(categoria.getName());
    }
}

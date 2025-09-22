package com.example.biblioteca.Services;

import com.example.biblioteca.Entities.Categoria;
import com.example.biblioteca.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //Esse metodo categoria está acessando o repoositório e buscando todas as categorias armazenadas nele
    public List<Categoria> getCategoria() {
        return categoriaRepository.findAll();
    }

    public Categoria createCategoria(String nome){
        Categoria categoria = new Categoria();
        categoria.setName(nome);

        return  categoriaRepository.save(categoria);
    }
}
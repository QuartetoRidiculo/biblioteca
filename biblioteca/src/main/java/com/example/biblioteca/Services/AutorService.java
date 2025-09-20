package com.example.biblioteca.Services;

import com.example.biblioteca.Entities.Autor;
import com.example.biblioteca.Repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public Autor criarAutor(String nome, Integer idade) {
        Autor autor = new Autor();
        autor.setNome(nome);
        autor.setIdade(idade);
        return autorRepository.save(autor);
    }

    public List<Autor> getAutor(){
        return autorRepository.findAll();
    }

    public Autor getAutorID(Long ID){
        return autorRepository.findById(ID).orElseThrow(()->new RuntimeException("Autor não encontrado!"));
    }
}

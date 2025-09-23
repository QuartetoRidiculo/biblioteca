package com.example.biblioteca.Services;

import com.example.biblioteca.Entities.Categoria;
import com.example.biblioteca.Entities.Livro;
import com.example.biblioteca.Repositories.CategoriaRepository;
import com.example.biblioteca.Repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    private CategoriaRepository categoriaRepository;

    public void addCategoriaAoLivro(Long livroId, Long categoriaId) {
        Livro livro = livroRepository.findById(livroId).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        livro.getCategorias().add(categoria);
        livroRepository.save(livro);
    }

    public Livro addLivro(Livro livroAdicionado) {
        return livroRepository.save(livroAdicionado);
    }

    public void deleteLivro(Long livroId) {
        livroRepository.deleteById(livroId);
    }

    public List<Livro> getLivros() {
        return livroRepository.findAll();
    }

    public Livro getLivroId(Long livroId) {
        return livroRepository.findById(livroId).orElseThrow(() -> new RuntimeException("Livro não encontrado."));
    }
}

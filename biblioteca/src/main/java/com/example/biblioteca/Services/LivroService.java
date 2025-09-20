package com.example.biblioteca.Services;

import com.example.biblioteca.Entities.Livro;
import com.example.biblioteca.Repositories.LivroRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    private CategoriaRepository categoriaRepository;
  
  public void addCategoriaAoLivro(Long livroId, Long categoriaId){
        Livro livro = livroRepository.findById(livroId).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        livro.getCategorias().add(categoria);
        livroRepository.save(livro);
    }

    //Adicionando o livro
    public Livro addLivro(Livro livroAdicionado){
        return livroRepository.save(livroAdicionado);
    }

    //Deletando livro pelo id
    public void deleteLivro(Long livroId){
        livroRepository.deleteById(livroId);
    }

    //Listagem de livros
    public List<Livro> listLivros(){
        return livroRepository.findAll();
    }

    //Listagem de livro por id
    public Livro listLivrosId(Long livroId){
        return livroRepository.findById(livroId).orElseThrow(()-> new RuntimeException("Livro não encontrado."));
    }
}

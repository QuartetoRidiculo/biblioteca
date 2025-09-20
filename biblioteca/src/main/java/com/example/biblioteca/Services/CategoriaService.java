package com.example.biblioteca.Services;

import com.example.biblioteca.Repositories.CategoriaRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
}
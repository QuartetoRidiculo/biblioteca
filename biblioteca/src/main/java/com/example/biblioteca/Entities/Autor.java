package com.example.biblioteca.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "autor")
@Getter
@Setter
@NoArgsConstructor
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;

    public Autor(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @OneToOne(mappedBy = "autor", cascade = CascadeType.ALL)
    private Biografia biografia;

    @OneToMany(mappedBy = "autor", cascade =  CascadeType.ALL)
    private List<Livro>  livros;
}

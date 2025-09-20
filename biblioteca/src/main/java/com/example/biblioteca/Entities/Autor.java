package com.example.biblioteca.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;

    @OneToOne(mappedBy = "autor", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Biografia biografia;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Livro> livros;
}

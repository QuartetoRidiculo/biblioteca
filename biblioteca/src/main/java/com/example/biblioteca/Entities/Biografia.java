package com.example.biblioteca.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "biografia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Biografia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Autor autor;
}

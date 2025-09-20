package com.example.biblioteca.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

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
    @JsonBackReference
    private Autor autor;
}

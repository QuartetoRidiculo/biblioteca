package com.example.biblioteca.Repositories;

import com.example.biblioteca.Entities.Biografia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiografiaRepository extends JpaRepository<Biografia, Long> {
}

package com.example.biblioteca.Services;

import com.example.biblioteca.Entities.Biografia;
import com.example.biblioteca.Repositories.BiografiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiografiaService {
    @Autowired
    private BiografiaRepository biografiaRepository;

    public List<Biografia> getBiografias(){
        return biografiaRepository.findAll();
    }

    public Biografia getBiografiaById(Long id){
        return biografiaRepository.findById(id).orElseThrow(()-> new RuntimeException("Biografia não encontrada"));
    }

    public Biografia createBiografia(Biografia biografia) {
        return biografiaRepository.save(biografia);
    }
}

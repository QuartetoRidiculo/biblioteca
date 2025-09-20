package com.example.biblioteca.Controllers;

import com.example.biblioteca.Entities.Biografia;
import com.example.biblioteca.Services.BiografiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biografia")
public class BiografiaController {
    @Autowired
    private BiografiaService biografiaService;

    @GetMapping
    public List<Biografia> getBiografias() {
        return biografiaService.getBiografias();
    }

    @GetMapping("/{idBiografia}")
    public Biografia getBiografiaById(@PathVariable Long idBiografia) {
        return biografiaService.getBiografiaById(idBiografia);
    }

    @PostMapping
    public Biografia createBiografia(@RequestBody Biografia biografia) {
        return biografiaService.createBiografia(biografia);
    }
}

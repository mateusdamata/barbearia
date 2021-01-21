package com.barbearia.controller;

import com.barbearia.model.Perfil;
import com.barbearia.repository.PerfilRepository;
import com.barbearia.service.PerfilService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("perfil")
public class PerfilController {

    private final PerfilRepository perfilRepository;
    private final PerfilService perfilService;

    public PerfilController(PerfilRepository perfilRepository, PerfilService perfilService) {
        this.perfilRepository = perfilRepository;
        this.perfilService = perfilService;
    }

    @GetMapping
    public ResponseEntity<List<Perfil>> getAll() {
        return ResponseEntity.ok(perfilRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Perfil>> getById(@PathVariable long id) {
        return ResponseEntity.ok(perfilRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<String> createPerfil(@RequestBody Perfil perfil) {
        perfilRepository.save(perfil);
        return ResponseEntity.ok("Perfil cadastrado com sucesso!");
    }

    @PutMapping
    public ResponseEntity<Perfil> updatePerfil(@RequestBody Perfil perfil) {
        perfilRepository.save(perfil);
        return ResponseEntity.ok(perfil);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerfil(@PathVariable long id) {
        return ResponseEntity.ok(perfilService.deleteById(id));
    }
}

package com.barbearia.service;

import com.barbearia.model.Perfil;
import com.barbearia.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public String deleteById (long id) {

        Perfil perfil =  perfilRepository.findById(id).orElse(null);

        if (perfil != null) {
            perfilRepository.deleteById(id);
            return "Perfil deletado com sucesso!";
        }

        return "O perfil não existe na base de dados";

    }
}

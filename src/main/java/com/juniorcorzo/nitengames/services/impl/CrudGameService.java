package com.juniorcorzo.nitengames.services.impl;

import com.juniorcorzo.nitengames.entity.Games;
import com.juniorcorzo.nitengames.repository.GameRepository;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class CrudGameService implements CrudBasicService<Games, Integer> {
    @Autowired
    private GameRepository gameRepository;

    @Override
    public Games create(Games entity) {
        return gameRepository.save(entity);
    }

    @Override
    public Games update(Games entity,Integer id) {
        if (!gameRepository.existsById(id)){
            throw new RuntimeException("Juego no encontrado, ID = " + id);
        }
        return gameRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        gameRepository.deleteById(id);
        return !gameRepository.existsById(id);
    }

    @Override
    public List<Games> getAll() {
        return gameRepository.findAll();
    }

    @Override
    public Games getById(Integer id) {
        return gameRepository.findById(id).orElse(null);
    }
}

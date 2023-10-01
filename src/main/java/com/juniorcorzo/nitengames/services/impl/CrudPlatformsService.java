package com.juniorcorzo.nitengames.services.impl;

import com.juniorcorzo.nitengames.entity.Platforms;
import com.juniorcorzo.nitengames.repository.PlatformsRepository;
import com.juniorcorzo.nitengames.services.CrudBasicService;

import java.util.List;

public class CrudPlatformsService implements CrudBasicService<Platforms, Integer> {
    private PlatformsRepository plataformsRepository;
    @Override
    public Platforms create(Platforms entity) {
        return plataformsRepository.save(entity);
    }

    @Override
    public Platforms update(Platforms entity, Integer id) {
        if (!plataformsRepository.existsById(id)) throw new RuntimeException("No se encontro la plataforma, ID: " + id);
        return plataformsRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        plataformsRepository.deleteById(id);
        return !plataformsRepository.existsById(id);
    }

    @Override
    public List<Platforms> getAll() {
        return plataformsRepository.findAll();
    }

    @Override
    public Platforms getById(Integer id) {
        return plataformsRepository.findById(id).orElse(null);
    }
}

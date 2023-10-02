package com.juniorcorzo.nitengames.services.impl;

import com.juniorcorzo.nitengames.entity.Categories;
import com.juniorcorzo.nitengames.repository.CategoriesRepository;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudCategoriesService implements CrudBasicService<Categories, Integer> {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories create(Categories entity) {
        return categoriesRepository.save(entity);
    }

    @Override
    public Categories update(Categories entity, Integer id) {
        if (!categoriesRepository.existsById(id)) throw new RuntimeException("Categoria no encontrada, ID: " + id);
        return categoriesRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        categoriesRepository.deleteById(id);
        return !categoriesRepository.existsById(id);
    }

    @Override
    public List<Categories> getAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories getById(Integer id) {
        return categoriesRepository.findById(id).orElse(null);
    }
}

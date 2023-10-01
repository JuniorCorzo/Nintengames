package com.juniorcorzo.nitengames.services.decorator;

import com.juniorcorzo.nitengames.services.CrudBasicService;

import java.util.List;

public abstract class CrudDecorator<T, Integer> implements CrudBasicService<T, Integer> {
   protected CrudBasicService<T, Integer> baseService;

    public CrudDecorator(CrudBasicService<T, Integer> baseService) {
        this.baseService = baseService;
    }

    @Override
    public T create(T entity) {
        return this.baseService.create(entity);
    }

    @Override
    public T update(T entity, Integer id) {
        return this.update(entity, id);
    }

    @Override
    public boolean delete(Integer id) {
        return this.baseService.delete(id);
    }

    @Override
    public List<T> getAll() {
        return this.baseService.getAll();
    }

    @Override
    public T getById(Integer id) {
        return this.baseService.getById(id);
    }
}

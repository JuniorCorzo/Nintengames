package com.juniorcorzo.nitengames.services.decorator;

import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServiceDecorated<T, Integer> extends CrudDecorator<T, Integer> {

    public CrudServiceDecorated(CrudBasicService<T, Integer> baseService){
        super(baseService);
    }

    @Override
    public T create(T entity) {
        return super.create(entity);
    }

    @Override
    public T update(T entity, Integer id) {
        return super.update(entity, id);
    }

    @Override
    public boolean delete(Integer id) {
        return super.delete(id);
    }

    @Override
    public List<T> getAll() {
        return super.getAll();
    }

    @Override
    public T getById(Integer id) {
        return super.getById(id);
    }
}

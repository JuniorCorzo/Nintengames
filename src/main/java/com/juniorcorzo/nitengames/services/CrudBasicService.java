package com.juniorcorzo.nitengames.services;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface CrudBasicService<T, Integer> {
    T create(T entity);
    T update(T entity, Integer id);
    boolean delete(Integer id);
    List<T> getAll();
    T getById(Integer id);

}

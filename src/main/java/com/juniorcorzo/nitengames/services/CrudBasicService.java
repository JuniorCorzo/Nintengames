package com.juniorcorzo.nitengames.services;

import java.util.List;

public interface CrudBasicService<T, Integer> {
    T create(T entity);
    T update(Integer id);
    boolean delete(Integer id);
    List<T> getAll();
    T getById();

}

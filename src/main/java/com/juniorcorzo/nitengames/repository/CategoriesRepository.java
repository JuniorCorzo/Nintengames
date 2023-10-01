package com.juniorcorzo.nitengames.repository;

import com.juniorcorzo.nitengames.entity.Categories;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoriesRepository extends ListCrudRepository<Categories, Integer> {
}

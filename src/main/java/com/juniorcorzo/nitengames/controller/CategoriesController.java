package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.entity.Categories;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
public class CategoriesController extends CrudController<Categories> {
    public CategoriesController(CrudBasicService<Categories, Integer> crudBasicService){
        super(crudBasicService);
    }
}

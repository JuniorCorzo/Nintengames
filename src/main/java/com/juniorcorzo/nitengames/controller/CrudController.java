package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.services.CrudBasicService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@NoArgsConstructor
public class CrudController<T> {
    private CrudBasicService<T, Integer> crudBasic;

    @Autowired
    public CrudController(CrudBasicService<T, Integer> crudBasic) {
        this.crudBasic = crudBasic;
    }

    @GetMapping("/")
    public List<T> getAll(){
        return crudBasic.getAll();
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable int id){
        return crudBasic.getById(id);
    }

    @PostMapping("/create")
    public T create(@RequestBody T entity){
       return crudBasic.create(entity);
    }

    @PutMapping("/update/{id}")
    public T update(@RequestBody T entity, @PathVariable int id){
        return crudBasic.update(entity, id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id){
        return crudBasic.delete(id);
    }
}

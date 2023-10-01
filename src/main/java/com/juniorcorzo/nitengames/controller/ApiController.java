package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.entity.Games;
import com.juniorcorzo.nitengames.entity.Platforms;
import com.juniorcorzo.nitengames.entity.Users;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ApiController {
    @Autowired
    private CrudBasicService<Users, Integer> crudService;

    @GetMapping("")
    public List<Users> getUsers(){
        return crudService.getAll();
    }
}

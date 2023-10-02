package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.entity.Users;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController extends CrudController<Users> {
    @Autowired
    public UserController(CrudBasicService<Users, Integer> crudBasic) {
        super(crudBasic);
    }
}

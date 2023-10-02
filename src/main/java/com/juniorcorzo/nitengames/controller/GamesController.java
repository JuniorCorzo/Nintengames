package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.entity.Games;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/game")
public class GamesController extends CrudController<Games>{
    public GamesController(CrudBasicService<Games, Integer> crudBasic) {
        super(crudBasic);
    }
}

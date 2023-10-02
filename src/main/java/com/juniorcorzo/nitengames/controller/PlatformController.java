package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.entity.Platforms;
import com.juniorcorzo.nitengames.services.CrudBasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/platform")
public class PlatformController extends CrudController<Platforms>{
    public PlatformController(CrudBasicService<Platforms, Integer> crudBasic) {
        super(crudBasic);
    }
}

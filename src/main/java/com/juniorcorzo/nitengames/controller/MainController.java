package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.configuration.Pages;
import com.juniorcorzo.nitengames.model.UserForm;
import com.juniorcorzo.nitengames.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class MainController {
    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/")
    public ModelAndView getHome(){
        return new ModelAndView(Pages.HOME).addObject("userInfo", new UserForm());
    }

    /*@PostMapping("/login")
    public ModelAndView validLogin(UserForm userInfo){
        if (new ValidatedService().isValidatedUser(userInfo.getEmail(), userInfo.getPassword(), userRepository)) return new ModelAndView(Pages.DASHBOARD);
        return new ModelAndView(Pages.HOME);

    }*/

    @GetMapping("/dashboard")
    public ModelAndView getDashboard(){
        ModelAndView dashboard = new ModelAndView(Pages.DASHBOARD);
        return dashboard;
    }
}

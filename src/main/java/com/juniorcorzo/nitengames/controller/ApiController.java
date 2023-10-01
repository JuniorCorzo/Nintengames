package com.juniorcorzo.nitengames.controller;

import com.juniorcorzo.nitengames.entity.Games;
import com.juniorcorzo.nitengames.entity.Users;
import com.juniorcorzo.nitengames.repository.GameRepository;
import com.juniorcorzo.nitengames.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ApiController {
    private final GameRepository gameRepository;
    private final UserRepository userRepository;

    public ApiController(GameRepository gameRepository, UserRepository userRepository) {
        this.gameRepository = gameRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/games")
    public List<Games> findAll(){
        return gameRepository.findAll();
    }

    @GetMapping("/users")
    public List<Users> allUsers(){
        return userRepository.findAll();
    }
}

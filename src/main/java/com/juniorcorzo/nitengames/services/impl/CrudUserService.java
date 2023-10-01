package com.juniorcorzo.nitengames.services.impl;

import com.juniorcorzo.nitengames.entity.Users;
import com.juniorcorzo.nitengames.repository.UserRepository;
import com.juniorcorzo.nitengames.services.CrudBasicService;

import java.util.List;

public class CrudUserService implements CrudBasicService<Users, Integer> {
    private UserRepository userRepository;
    @Override
    public Users create(Users entity) {
        return userRepository.save(entity);
    }

    @Override
    public Users update(Users entity, Integer id) {
        if (userRepository.existsById(id)) throw new RuntimeException("Usuario no encontrado, ID" + id);
        return userRepository.save(entity);
    }

    @Override
    public boolean delete(Integer id) {
        userRepository.deleteById(id);
        return !userRepository.existsById(id);
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public boolean validateUser(String email, String password){
        return (long) userRepository.findByEmailAndPassword(email, password).size() == 1;
    }
}

package com.juniorcorzo.nitengames.repository;

import com.juniorcorzo.nitengames.entity.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ListCrudRepository<Users, Integer> {

    List<Users> findByEmailAndPassword(@NotNull @Email String email, @NotEmpty String password);
}

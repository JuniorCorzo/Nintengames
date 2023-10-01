package com.juniorcorzo.nitengames.repository;

import com.juniorcorzo.nitengames.entity.Users;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformsRepository extends ListCrudRepository<Users, Integer> {
}

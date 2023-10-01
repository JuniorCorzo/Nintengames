package com.juniorcorzo.nitengames.repository;

import com.juniorcorzo.nitengames.entity.Games;
import org.springframework.data.repository.ListCrudRepository;

public interface GameRepository extends ListCrudRepository<Games, Integer> {
}

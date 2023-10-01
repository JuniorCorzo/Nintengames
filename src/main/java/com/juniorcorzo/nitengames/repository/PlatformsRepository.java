package com.juniorcorzo.nitengames.repository;

import com.juniorcorzo.nitengames.entity.Platforms;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformsRepository extends ListCrudRepository<Platforms, Integer> {
}

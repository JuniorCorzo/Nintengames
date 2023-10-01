package com.juniorcorzo.nitengames.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Platforms(@Id int idPlatforms, @Column("name") String name) {
}

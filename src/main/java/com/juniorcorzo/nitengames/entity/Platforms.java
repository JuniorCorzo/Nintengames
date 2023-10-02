package com.juniorcorzo.nitengames.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "plataforms")
public record Platforms(@Id int idPlatforms, @Column("name") String name) {
}

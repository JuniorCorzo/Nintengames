package com.juniorcorzo.nitengames.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Plataforms(@Id int idPlataforms, @Column("name") String name) {
}

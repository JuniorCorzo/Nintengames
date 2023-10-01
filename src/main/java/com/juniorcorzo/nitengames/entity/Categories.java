package com.juniorcorzo.nitengames.entity;

import org.springframework.data.annotation.Id;

public record Categories(@Id int idCategories, String name) {
}

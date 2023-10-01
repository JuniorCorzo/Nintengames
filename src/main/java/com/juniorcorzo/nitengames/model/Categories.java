package com.juniorcorzo.nitengames.model;

import org.springframework.data.annotation.Id;

public record Categories(@Id int idCategories, String name) {
}

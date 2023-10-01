package com.juniorcorzo.nitengames.model;

import org.springframework.data.annotation.Id;

public record Games(@Id int idGames, String title, String cover, String year, int idPlataforms, int idCategories) {
}

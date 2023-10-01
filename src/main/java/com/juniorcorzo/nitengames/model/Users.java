package com.juniorcorzo.nitengames.model;

import com.juniorcorzo.nitengames.repository.UserRepository;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Users(@Id int idUsers,
                    @NotEmpty
                    @Column("fullname") String fullName,

                    @NotEmpty
                    @Email
                    String email,

                    @NotEmpty
                    String password) {
    public Users {
    }
}

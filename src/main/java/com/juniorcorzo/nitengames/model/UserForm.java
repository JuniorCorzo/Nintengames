package com.juniorcorzo.nitengames.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
    private String email;
    private String password;

    public UserForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

}

package com.example.toiletapps.security.model.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterRequest(
                            @NotBlank @Email String username,
                            @NotBlank String password) {
}

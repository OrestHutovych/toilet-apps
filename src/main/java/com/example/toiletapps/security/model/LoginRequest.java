package com.example.toiletapps.security.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @Email @NotBlank String username,
        @NotBlank String password
) {
}

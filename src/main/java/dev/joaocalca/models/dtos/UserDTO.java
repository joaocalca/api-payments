package dev.joaocalca.models.dtos;

import dev.joaocalca.models.enums.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType type) {
}

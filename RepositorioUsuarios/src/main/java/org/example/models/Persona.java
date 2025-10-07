package org.example.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Persona {
    Long id;
    UUID uuid;
    String nombre;
    String email;
    LocalDateTime createrdAt;
    LocalDateTime updatedAt;
}

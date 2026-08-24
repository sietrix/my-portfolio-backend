package com.portfolio.my_portfolio_backend.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private Long id;

    @NotBlank(message = "El nombre del titulo no puede estar vacío")
    private String degree;  // Ej: "Ingenieria en Sistemas"

    @NotBlank(message = "El nombre de la institución no puede estar vacío")
    private String institution;  // Ej: "Universidad de Alicante"

    @NotNull(message = "El fecha de inicio no puede se nula")
    @PastOrPresent(message = "La fecha de inicio no puede ser futura")
    private LocalDate startDate;

    @PastOrPresent(message = "La fecha de fin no puede ser futura")
    private LocalDate endDate;  // puede ser null si está en curso

    @NotBlank(message = "La descripción no puede estar vacía")
    private String description;  // Breve description de logros o cursos

    // La validación de la clave foránea se maneja a nivel de servicio
    private Long personalInfoId;  // Clave foránea a PersonalInfo
}
